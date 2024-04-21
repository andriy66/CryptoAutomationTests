package utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileUtil {
    public static String getValueByKey(String filePath, String key) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            File jsonFile = new File(filePath);
            JsonNode rootNode = mapper.readTree(jsonFile);
            JsonNode valueNode = rootNode.path(key);
            if (!valueNode.isMissingNode()) {
                return valueNode.asText();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String readConfigFile(final String pathName) {

        try {
            return FileUtils.readFileToString(new File(pathName), Charset.defaultCharset());
        } catch (IOException e) {
            throw new RuntimeException("Config file " + pathName + " not found");
        }
    }
}

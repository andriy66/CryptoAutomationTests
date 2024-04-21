package utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;

public class ParserUtil {
    public static <T> T parse(Response response, Class<T> typeClass) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(response.body().asString(), typeClass);
        } catch (JsonProcessingException e) {
            //TODO Logging
            System.out.println("Json processing failed: " + e.getMessage());
        }
        return null;
    }
}

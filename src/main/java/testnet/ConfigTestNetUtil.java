package testnet;

import com.google.gson.Gson;
import testnet.dto.ConfigTestNet;
import utils.FileUtil;

import static constants.TestNetConstants.CONFIG_TESTNET_JSON_PATH;

public class ConfigTestNetUtil {
    public static ConfigTestNet getTestNetConfig() {
        return new Gson().fromJson(FileUtil.readConfigFile(CONFIG_TESTNET_JSON_PATH.toString()), ConfigTestNet.class);
    }
}

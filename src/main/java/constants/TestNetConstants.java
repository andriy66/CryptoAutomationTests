package constants;

import java.nio.file.Paths;

public class TestNetConstants {
    public static final String RESOURCES_FOLDER_PATH_STR = Paths.get( "src", "main", "resources").toString();
    public static final String API_KEYS_TESTNET_PATH = Paths.get( RESOURCES_FOLDER_PATH_STR, "api_keys_testnet.json").toString();
    public static final String CONFIG_TESTNET_JSON_PATH = Paths.get( RESOURCES_FOLDER_PATH_STR, "config_testnet.json").toString();
}

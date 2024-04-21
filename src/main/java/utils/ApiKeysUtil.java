package utils;

import constants.ApiKeys;
import constants.TestNetConstants;

public class ApiKeysUtil {
    public static String getBtcTestNetApiKey() {
        return FileUtil.getValueByKey(TestNetConstants.API_KEYS_TESTNET_PATH, ApiKeys.BTC_TESTNET.getApiKey());
    }
}

package testnet.btc;

import io.restassured.response.Response;
import testnet.ConfigTestNetUtil;
import testnet.TestNetEndpoints;
import testnet.TransactionType;
import utils.ApiKeysUtil;
import utils.UrlGeneratorUtil;
import utils.rest.RestUtil;

import java.util.HashMap;
import java.util.Map;

public class BtcTestnetClient {
    public Response getAllTransactionsInfo(TransactionType transactionType) {
        String baseUrl = ConfigTestNetUtil.getTestNetConfig().getApplicationUrl() + TestNetEndpoints.GET_ALL_TRANSACTIONS;
        Map<String, String> params = new HashMap<>();
        params.put("api_key", ApiKeysUtil.getBtcTestNetApiKey());
        params.put("type", transactionType.getType());
        String url = UrlGeneratorUtil.generateUrl(baseUrl, params);
        return RestUtil.get(url);
    }

    public Response getNewAddress(String label) {
        String baseUrl = ConfigTestNetUtil.getTestNetConfig().getApplicationUrl() + TestNetEndpoints.GET_NEW_ADDRESS;
        Map<String, String> params = new HashMap<>();
        params.put("api_key", ApiKeysUtil.getBtcTestNetApiKey());
        params.put("label", label);
        String url = UrlGeneratorUtil.generateUrl(baseUrl, params);
        return RestUtil.get(url);
    }

    public Response sendBtcTestNetCoins(String btcTestAddress, double amount) {
        //Realization of the method
        return null;
    }
}

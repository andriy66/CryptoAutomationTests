package testnet;

public class TestNetEndpoints {
    private static final String version = "v2";
    private static final String basePrefix = "/api/" + version;

    public static final String GET_ALL_TRANSACTIONS = String.format("%s/get_transactions", basePrefix);
    public static final String GET_NEW_ADDRESS= String.format("%s/get_new_address", basePrefix);
}

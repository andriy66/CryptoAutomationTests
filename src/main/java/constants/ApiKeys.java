package constants;

public enum ApiKeys {
    BTC_TESTNET("btc-testnet");
    private String key;
    ApiKeys(String key) {
        this.key = key;
    }
    public String getApiKey() {
        return key;
    }
}

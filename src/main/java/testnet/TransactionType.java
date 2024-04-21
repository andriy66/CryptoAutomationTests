package testnet;

public enum TransactionType {
    RECEIVED("received"), PENDING("pending");

    private String type;
    TransactionType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

package testnet.dto;

public class AmountReceived {
    private String recipient;
    private Double amount;

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "AmountReceived{" +
                "recipient='" + recipient + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}

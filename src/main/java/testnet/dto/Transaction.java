package testnet.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Transaction {
    private String txid;
    @JsonProperty("from_green_address")
    private boolean fromGreenAddress;
    private long time;
    private int confirmations;
    @JsonProperty("amounts_received")
    private List<AmountReceived> amountsReceived;
    private List<String> senders;
    private double confidence;
    @JsonProperty("propagated_by_nodes")
    private Object propagatedByNodes;

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public boolean isFromGreenAddress() {
        return fromGreenAddress;
    }

    public void setFromGreenAddress(boolean fromGreenAddress) {
        this.fromGreenAddress = fromGreenAddress;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    public List<AmountReceived> getAmountsReceived() {
        return amountsReceived;
    }

    public void setAmountsReceived(List<AmountReceived> amountsReceived) {
        this.amountsReceived = amountsReceived;
    }

    public List<String> getSenders() {
        return senders;
    }

    public void setSenders(List<String> senders) {
        this.senders = senders;
    }

    public double getConfidence() {
        return confidence;
    }

    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }

    public Object getPropagatedByNodes() {
        return propagatedByNodes;
    }

    public void setPropagatedByNodes(Object propagatedByNodes) {
        this.propagatedByNodes = propagatedByNodes;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "txid='" + txid + '\'' +
                ", fromGreenAddress=" + fromGreenAddress +
                ", time=" + time +
                ", confirmations=" + confirmations +
                ", amountsReceived=" + amountsReceived +
                ", senders=" + senders +
                ", confidence=" + confidence +
                ", propagatedByNodes=" + propagatedByNodes +
                '}';
    }
}

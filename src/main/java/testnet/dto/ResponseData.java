package testnet.dto;

import java.util.List;

public class ResponseData {
    private String network;
    private List<Transaction> txs;

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public List<Transaction> getTxs() {
        return txs;
    }

    public void setTxs(List<Transaction> txs) {
        this.txs = txs;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "network='" + network + '\'' +
                ", txs=" + txs +
                '}';
    }
}

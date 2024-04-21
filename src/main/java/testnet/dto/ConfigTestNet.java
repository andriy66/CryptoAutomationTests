package testnet.dto;

import com.google.gson.annotations.SerializedName;

public class ConfigTestNet {
    @SerializedName("application_url")
    private String applicationUrl;

    public String getApplicationUrl() {
        return applicationUrl;
    }

    public void setApplicationUrl(String applicationUrl) {
        this.applicationUrl = applicationUrl;
    }
}

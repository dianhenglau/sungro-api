package sungro.api;

import java.io.Serializable;

public class ParamForDeleteStock implements Serializable {
    private String sessionId;
    private String sku;

    public ParamForDeleteStock() {
        sessionId = "";
        sku = "";
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}

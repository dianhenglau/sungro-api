package sungro.api;

import java.io.Serializable;

public class ParamForAddSale implements Serializable {
    private String sessionId;
    private String sku;
    private int soldQuantity;

    public ParamForAddSale() {
        sessionId = "";
        sku = "";
        soldQuantity = 0;
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

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }
}

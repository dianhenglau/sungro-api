package sungro.api;

import java.io.Serializable;

public class ParamForDeleteSale implements Serializable {
    private String sessionId;
    private int saleId;

    public ParamForDeleteSale() {
        sessionId = "";
        saleId = 0;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }
}

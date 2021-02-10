package sungro.api;

import java.io.Serializable;

public class ParamForGetManyStockTrx implements Serializable {
    private String sessionId;
    private String sku;
    private int page;

    public ParamForGetManyStockTrx() {
        sessionId = "";
        sku = "";
        page = 1;
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

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}

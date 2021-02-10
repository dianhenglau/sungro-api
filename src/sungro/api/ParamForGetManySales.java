package sungro.api;

import java.io.Serializable;
import java.time.LocalDate;

public class ParamForGetManySales implements Serializable {
    private String sessionId;
    private int productId;
    private String sku;
    private LocalDate onDate;
    private LocalDate onMonth;
    private int page;

    public ParamForGetManySales() {
        sessionId = "";
        productId = 0;
        sku = "";
        onDate = LocalDate.of(1970, 1, 1);
        onMonth = LocalDate.of(1970, 1, 1);
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public LocalDate getOnDate() {
        return onDate;
    }

    public void setOnDate(LocalDate onDate) {
        this.onDate = onDate;
    }

    public LocalDate getOnMonth() {
        return onMonth;
    }

    public void setOnMonth(LocalDate onMonth) {
        this.onMonth = onMonth;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}

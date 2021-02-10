package sungro.api;

import java.io.Serializable;
import java.time.LocalDate;

public class ParamForGetManyStock implements Serializable {
    private String sessionId;
    private String sku;
    private String name;
    private String category;
    private LocalDate expiryDate;
    private int page;

    public ParamForGetManyStock() {
        sessionId = "";
        sku = "";
        name = "";
        category = "";
        expiryDate = LocalDate.of(1970, 1, 1);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}

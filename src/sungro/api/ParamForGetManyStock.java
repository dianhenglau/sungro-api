package sungro.api;

import java.io.Serializable;
import java.time.LocalDate;

public class ParamForGetManyStock implements Serializable {
    private String sessionId;
    private String sku;
    private int productId;
    private String name;
    private String category;
    private LocalDate expiryDateFrom;
    private LocalDate expiryDateTo;
    private int page;

    public ParamForGetManyStock() {
        sessionId = "";
        sku = "";
        productId = 0;
        name = "";
        category = "";
        expiryDateFrom = LocalDate.of(1970, 1, 1);
        expiryDateTo = LocalDate.of(1970, 1, 1);
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

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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

    public LocalDate getExpiryDateFrom() {
        return expiryDateFrom;
    }

    public void setExpiryDateFrom(LocalDate expiryDate) {
        this.expiryDateFrom = expiryDate;
    }

    public LocalDate getExpiryDateTo() {
        return expiryDateTo;
    }

    public void setExpiryDateTo(LocalDate expiryDateTo) {
        this.expiryDateTo = expiryDateTo;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}

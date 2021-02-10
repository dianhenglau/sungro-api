package sungro.api;

import java.io.Serializable;
import java.time.LocalDate;

public class ParamForAddStock implements Serializable {
    private String sessionId;
    private int productId;
    private int quantity;
    private LocalDate expiryDate;

    public ParamForAddStock() {
        sessionId = "";
        productId = 0;
        quantity = 0;
        expiryDate = LocalDate.of(1970, 1, 1);
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}

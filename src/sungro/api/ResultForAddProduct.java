package sungro.api;

import java.io.Serializable;

public class ResultForAddProduct implements Serializable {
    private Status status;
    private int newProductId;

    public ResultForAddProduct() {
        status = Status.SUCCESS;
        newProductId = 0;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getNewProductId() {
        return newProductId;
    }

    public void setNewProductId(int newProductId) {
        this.newProductId = newProductId;
    }

    public enum Status {
        SUCCESS, INVALID_SESSION_ID, MISSING_NAME, REPEATED_NAME, MISSING_CATEGORY, INVALID_CATEGORY,
        MISSING_PRODUCT_PRICE, INVALID_PRODUCT_PRICE, MISSING_STATUS, INVALID_STATUS, SERVER_ERROR
    }
}

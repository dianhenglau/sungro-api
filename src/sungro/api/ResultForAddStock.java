package sungro.api;

import java.io.Serializable;

public class ResultForAddStock implements Serializable {
    private Status status;
    private String newSku;

    public ResultForAddStock() {
        status = Status.SUCCESS;
        newSku = "";
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getNewSku() {
        return newSku;
    }

    public void setNewSku(String newSku) {
        this.newSku = newSku;
    }

    public enum Status {
        SUCCESS, INVALID_SESSION_ID, MISSING_PRODUCT_ID, INVALID_PRODUCT_ID, MISSING_QUANTITY, INVALID_QUANTITY,
        MISSING_EXPIRY_DATE, INVALID_EXPIRY_DATE, SERVER_ERROR
    }
}

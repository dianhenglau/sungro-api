package sungro.api;

import java.io.Serializable;

public class ResultForSetProduct implements Serializable {
    private Status status;

    public ResultForSetProduct() {
        status = Status.SUCCESS;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public enum Status {
        SUCCESS, INVALID_SESSION_ID, NOT_FOUND, MISSING_NAME, REPEATED_NAME, MISSING_CATEGORY, INVALID_CATEGORY,
        MISSING_PRODUCT_PRICE, INVALID_PRODUCT_PRICE, MISSING_STATUS, INVALID_STATUS, SERVER_ERROR
    }
}

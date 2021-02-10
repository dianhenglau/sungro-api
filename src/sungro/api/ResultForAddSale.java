package sungro.api;

import java.io.Serializable;

public class ResultForAddSale implements Serializable {
    private Status status;
    private int newSaleId;

    public ResultForAddSale() {
        status = Status.SUCCESS;
        newSaleId = 0;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getNewSaleId() {
        return newSaleId;
    }

    public void setNewSaleId(int newSaleId) {
        this.newSaleId = newSaleId;
    }

    public enum Status {
        SUCCESS, INVALID_SESSION_ID, MISSING_SKU, INVALID_SKU, MISSING_QUANTITY, INVALID_QUANTITY, SERVER_ERROR
    }
}

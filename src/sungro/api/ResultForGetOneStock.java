package sungro.api;

import java.io.Serializable;

public class ResultForGetOneStock implements Serializable {
    private Status status;
    private Stock stock;

    public ResultForGetOneStock() {
        status = Status.SUCCESS;
        stock = new Stock();
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public enum Status {SUCCESS, INVALID_SESSION_ID, NOT_FOUND, SERVER_ERROR}
}

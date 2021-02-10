package sungro.api;

import java.io.Serializable;

public class ResultForGetOneProduct implements Serializable {
    private Status status;
    private Product product;

    public ResultForGetOneProduct() {
        status = Status.SUCCESS;
        product = new Product();
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public enum Status {SUCCESS, INVALID_SESSION_ID, NOT_FOUND, SERVER_ERROR}
}

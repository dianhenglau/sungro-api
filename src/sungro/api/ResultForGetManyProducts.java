package sungro.api;

import java.io.Serializable;
import java.util.ArrayList;

public class ResultForGetManyProducts implements Serializable {
    private Status status;
    private ArrayList<Product> products;
    private int currentPage;
    private int maxPage;

    public ResultForGetManyProducts() {
        status = Status.SUCCESS;
        products = new ArrayList<>();
        currentPage = 0;
        maxPage = 0;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getMaxPage() {
        return maxPage;
    }

    public void setMaxPage(int maxPage) {
        this.maxPage = maxPage;
    }

    public enum Status {SUCCESS, INVALID_SESSION_ID, SERVER_ERROR}
}

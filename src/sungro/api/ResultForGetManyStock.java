package sungro.api;

import java.io.Serializable;
import java.util.ArrayList;

public class ResultForGetManyStock implements Serializable {
    private Status status;
    private ArrayList<Stock> stock;
    private int currentPage;
    private int maxPage;

    public ResultForGetManyStock() {
        status = Status.SUCCESS;
        stock = new ArrayList<>();
        currentPage = 0;
        maxPage = 0;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ArrayList<Stock> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Stock> stock) {
        this.stock = stock;
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

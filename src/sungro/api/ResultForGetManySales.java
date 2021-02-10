package sungro.api;

import java.io.Serializable;
import java.util.ArrayList;

public class ResultForGetManySales implements Serializable {
    private Status status;
    private ArrayList<Sale> sales;
    private int currentPage;
    private int maxPage;

    public ResultForGetManySales() {
        status = Status.SUCCESS;
        sales = new ArrayList<>();
        currentPage = 0;
        maxPage = 0;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ArrayList<Sale> getSales() {
        return sales;
    }

    public void setSales(ArrayList<Sale> sales) {
        this.sales = sales;
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

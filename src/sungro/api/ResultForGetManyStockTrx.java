package sungro.api;

import java.io.Serializable;
import java.util.ArrayList;

public class ResultForGetManyStockTrx implements Serializable {
    private Status status;
    private ArrayList<StockTrx> stockTrx;
    private int currentPage;
    private int maxPage;

    public ResultForGetManyStockTrx() {
        status = Status.SUCCESS;
        stockTrx = new ArrayList<>();
        currentPage = 0;
        maxPage = 0;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ArrayList<StockTrx> getStockTrx() {
        return stockTrx;
    }

    public void setStockTrx(ArrayList<StockTrx> stockTrx) {
        this.stockTrx = stockTrx;
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

    public enum Status {SUCCESS, INVALID_SESSION_ID, NOT_FOUND, SERVER_ERROR}
}

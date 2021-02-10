package sungro.api;

import java.io.Serializable;
import java.time.LocalDateTime;

public class StockTrx implements Serializable {
    private int stockTrxId;
    private String sku;
    private int quantityVaried;
    private String remark;
    private int createdByUserId;
    private String createdByUserName;
    private LocalDateTime createdOn;

    public StockTrx() {
        stockTrxId = 0;
        sku = "";
        quantityVaried = 0;
        remark = "";
        createdByUserId = 0;
        createdByUserName = "";
        createdOn = LocalDateTime.of(1970, 1, 1, 0, 0, 0);
    }

    public int getStockTrxId() {
        return stockTrxId;
    }

    public void setStockTrxId(int stockTrxId) {
        this.stockTrxId = stockTrxId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getQuantityVaried() {
        return quantityVaried;
    }

    public void setQuantityVaried(int quantityVaried) {
        this.quantityVaried = quantityVaried;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getCreatedByUserId() {
        return createdByUserId;
    }

    public void setCreatedByUserId(int createdByUserId) {
        this.createdByUserId = createdByUserId;
    }

    public String getCreatedByUserName() {
        return createdByUserName;
    }

    public void setCreatedByUserName(String createdByUserName) {
        this.createdByUserName = createdByUserName;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }
}

package sungro.api;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Sale implements Serializable {
    private int saleId;
    private String sku;
    private int productId;
    private String productName;
    private String productCategory;
    private BigDecimal unitPrice;
    private int soldQuantity;
    private BigDecimal subTotalPrice;
    private int soldByUserId;
    private String soldByUserName;
    private LocalDateTime soldOn;

    public Sale() {
        saleId = 0;
        sku = "";
        productId = 0;
        productName = "";
        productCategory = "";
        unitPrice = BigDecimal.valueOf(0, 2);
        soldQuantity = 0;
        soldByUserId = 0;
        soldByUserName = "";
        soldOn = LocalDateTime.of(1970, 1, 1, 0, 0, 0);
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public BigDecimal getSubTotalPrice() {
        return subTotalPrice;
    }

    public void setSubTotalPrice(BigDecimal subTotalPrice) {
        this.subTotalPrice = subTotalPrice;
    }

    public int getSoldByUserId() {
        return soldByUserId;
    }

    public void setSoldByUserId(int soldByUserId) {
        this.soldByUserId = soldByUserId;
    }

    public String getSoldByUserName() {
        return soldByUserName;
    }

    public void setSoldByUserName(String soldByUserName) {
        this.soldByUserName = soldByUserName;
    }

    public LocalDateTime getSoldOn() {
        return soldOn;
    }

    public void setSoldOn(LocalDateTime soldOn) {
        this.soldOn = soldOn;
    }
}

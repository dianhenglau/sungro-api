package sungro.api;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Product implements Serializable {
    private int productId;
    private String name;
    private String category;
    private BigDecimal productPrice;
    private byte[] productPic;
    private String status;
    private int createdByUserId;
    private String createdByUserName;
    private LocalDateTime createdOn;

    public Product() {
        productId = 0;
        name = "";
        category = "";
        productPrice = BigDecimal.valueOf(0, 2);
        productPic = new byte[0];
        status = "";
        createdByUserId = 0;
        createdByUserName = "";
        createdOn = LocalDateTime.of(1970, 1, 1, 0, 0, 0);
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public byte[] getProductPic() {
        return productPic;
    }

    public void setProductPic(byte[] productPic) {
        this.productPic = productPic;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

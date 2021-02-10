package sungro.api;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.MathContext;

public class ParamForSetProduct implements Serializable {
    private String sessionId;
    private int productId;
    private String name;
    private String category;
    private BigDecimal productPrice;
    private byte[] productPic;
    private String status;

    public ParamForSetProduct() {
        sessionId = "";
        productId = 0;
        name = "";
        category = "";
        productPrice = new BigDecimal(0, new MathContext(2));
        productPic = new byte[0];
        status = "";
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
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
}

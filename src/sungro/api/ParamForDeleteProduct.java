package sungro.api;

import java.io.Serializable;

public class ParamForDeleteProduct implements Serializable {
    private String sessionId;
    private int productId;

    public ParamForDeleteProduct() {
        sessionId = "";
        productId = 0;
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
}

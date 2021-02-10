package sungro.api;

import java.io.Serializable;

public class ParamForSetStock implements Serializable {
    private String sessionId;
    private String sku;
    private int quantityVaried;
    private String remark;

    public ParamForSetStock() {
        sessionId = "";
        sku = "";
        quantityVaried = 0;
        remark = "";
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
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
}

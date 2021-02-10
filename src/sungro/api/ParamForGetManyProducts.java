package sungro.api;

import java.io.Serializable;

public class ParamForGetManyProducts implements Serializable {
    private String sessionId;
    private String name;
    private String category;
    private String status;
    private int page;

    public ParamForGetManyProducts() {
        sessionId = "";
        name = "";
        category = "";
        status = "";
        page = 1;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}

package sungro.api;

import java.io.Serializable;

public class ParamForGetManyUsers implements Serializable {
    private String sessionId;
    private String name;
    private String email;
    private String idNumber;
    private String role;
    private int page;

    public ParamForGetManyUsers() {
        sessionId = "";
        name = "";
        email = "";
        idNumber = "";
        role = "";
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}

package sungro.api;

import java.io.Serializable;

public class ParamForGetOneUser implements Serializable {
    private String sessionId;
    private int userId;

    public ParamForGetOneUser() {
        sessionId = "";
        userId = 0;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

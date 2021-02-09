package sungro.api;

import java.io.Serializable;

public class ParamForDeleteUser implements Serializable {
    private String sessionId;
    private int userId;

    public ParamForDeleteUser() {
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

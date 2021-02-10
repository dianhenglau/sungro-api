package sungro.api;

import java.io.Serializable;

public class ParamForGetCurrentUser implements Serializable {
    private String sessionId;

    public ParamForGetCurrentUser() {
        sessionId = "";
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}

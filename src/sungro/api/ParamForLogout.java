package sungro.api;

import java.io.Serializable;

public class ParamForLogout implements Serializable {
    private String sessionId;

    public ParamForLogout() {
        sessionId = "";
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}

package sungro.api;

import java.io.Serializable;

public class ResultForLogin implements Serializable {
    private Status status;
    private User user;
    private String sessionId;

    public ResultForLogin() {
        status = Status.SUCCESS;
        user = new User();
        sessionId = "";
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public enum Status {SUCCESS, INVALID_CREDENTIAL, SERVER_ERROR}
}

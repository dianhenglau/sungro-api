package sungro.api;

import java.io.Serializable;

public class ResultForLogout implements Serializable {
    private Status status;

    public ResultForLogout() {
        status = Status.SUCCESS;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public enum Status {SUCCESS, INVALID_SESSION_ID, SERVER_ERROR}
}

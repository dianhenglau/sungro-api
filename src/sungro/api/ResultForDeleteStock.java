package sungro.api;

import java.io.Serializable;

public class ResultForDeleteStock implements Serializable {
    private Status status;

    public ResultForDeleteStock() {
        status = Status.SUCCESS;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public enum Status {SUCCESS, INVALID_SESSION_ID, NOT_FOUND, DEPENDED, SERVER_ERROR}
}

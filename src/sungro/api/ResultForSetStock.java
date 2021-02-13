package sungro.api;

import java.io.Serializable;

public class ResultForSetStock implements Serializable {
    private Status status;

    public ResultForSetStock() {
        status = Status.SUCCESS;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public enum Status {
        SUCCESS, INVALID_SESSION_ID, NOT_FOUND, INVALID_QUANTITY_VARIED, MISSING_REMARK, SERVER_ERROR
    }
}

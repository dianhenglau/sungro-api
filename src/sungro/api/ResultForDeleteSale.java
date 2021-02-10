package sungro.api;

import java.io.Serializable;

public class ResultForDeleteSale implements Serializable {
    private Status status;

    public ResultForDeleteSale() {
        status = Status.SUCCESS;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public enum Status {SUCCESS, INVALID_SESSION_ID, NOT_FOUND, SERVER_ERROR}
}

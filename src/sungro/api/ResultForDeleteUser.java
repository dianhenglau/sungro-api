package sungro.api;

import java.io.Serializable;

public class ResultForDeleteUser implements Serializable {
    private Status status;

    public ResultForDeleteUser() {
        status = Status.SUCCESS;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public enum Status {SUCCESS, INVALID_SESSION_ID, PERMISSION_DENIED, NOT_FOUND, DEPENDED, SERVER_ERROR}
}

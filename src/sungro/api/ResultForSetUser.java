package sungro.api;

import java.io.Serializable;

public class ResultForSetUser implements Serializable {
    private Status status;

    public ResultForSetUser() {
        status = Status.SUCCESS;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public enum Status {
        SUCCESS, NOT_FOUND, MISSING_FIRST_NAME, MISSING_LAST_NAME, MISSING_EMAIL, INVALID_EMAIL, REPEATED_EMAIL,
        MISSING_ID_NUMBER, REPEATED_ID_NUMBER, MISSING_ID_TYPE, INVALID_ID_TYPE, MISSING_ROLE, INVALID_ROLE,
        MISSING_STATUS, INVALID_STATUS, SERVER_ERROR
    }
}

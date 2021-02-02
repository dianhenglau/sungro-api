package sungro.api;

public class ResultForAddUser {
    private Status status;
    private int newUserId;

    public ResultForAddUser() {
        status = Status.SUCCESS;
        newUserId = 0;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getNewUserId() {
        return newUserId;
    }

    public void setNewUserId(int newUserId) {
        this.newUserId = newUserId;
    }

    public enum Status {
        SUCCESS, MISSING_FIRST_NAME, MISSING_LAST_NAME, MISSING_EMAIL, INVALID_EMAIL, REPEATED_EMAIL, MISSING_ID_NUMBER,
        REPEATED_ID_NUMBER, MISSING_ID_TYPE, INVALID_ID_TYPE, MISSING_ROLE, INVALID_ROLE, MISSING_PASSWORD,
        MISSING_STATUS, INVALID_STATUS, INVALID_CREATED_BY, SERVER_ERROR
    }
}

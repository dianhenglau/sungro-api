package sungro.api;

public class ResultForDeleteUser {
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

    public enum Status {SUCCESS, NOT_FOUND, DEPENDED, SERVER_ERROR}
}

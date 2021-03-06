package sungro.api;

import java.io.Serializable;

public class ResultForGetCurrentUser implements Serializable {
    private Status status;
    private User user;

    public ResultForGetCurrentUser() {
        status = Status.SUCCESS;
        user = new User();
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

    public enum Status {SUCCESS, INVALID_SESSION_ID, SERVER_ERROR}
}

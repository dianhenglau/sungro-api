package sungro.api;

import java.io.Serializable;
import java.util.ArrayList;

public class ResultForGetManyUsers implements Serializable {
    private Status status;
    private ArrayList<User> users;
    private int currentPage;
    private int maxPage;

    public ResultForGetManyUsers() {
        status = Status.SUCCESS;
        users = new ArrayList<>();
        currentPage = 0;
        maxPage = 0;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getMaxPage() {
        return maxPage;
    }

    public void setMaxPage(int maxPage) {
        this.maxPage = maxPage;
    }

    public enum Status {SUCCESS, INVALID_SESSION_ID, PERMISSION_DENIED, SERVER_ERROR}
}

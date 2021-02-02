package sungro.api;

import java.io.Serializable;

public class ParamForGetOneUser implements Serializable {
    private int userId;

    public ParamForGetOneUser() {
        userId = 0;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

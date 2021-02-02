package sungro.api;

import java.io.Serializable;

public class ParamForDeleteUser implements Serializable {
    private int userId;

    public ParamForDeleteUser() {
        userId = 0;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

package sungro.api;

import java.io.Serializable;

public class ParamForLogin implements Serializable {
    private String email;
    private String password;

    public ParamForLogin() {
        email = "";
        password = "";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

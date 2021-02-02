package sungro.api;

public class ParamForGetManyUsers {
    private String name;
    private String idNumber;
    private String role;
    private int page;

    public ParamForGetManyUsers() {
        name = "";
        idNumber = "";
        role = "";
        page = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}

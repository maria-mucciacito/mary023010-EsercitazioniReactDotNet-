package com.infobasic.models;

public class User extends Person {
    private String username;
    private String password;
    private String role;

    public User(int id, String cf, String firstname, String lastname, String fax, String job, String username,
            String password, String role) {
        super(id, cf, firstname, lastname, fax, job);
        this.username = username;
        this.password = password;
        this.role = role;
    }

    @Override
    public String toString() {
        return "{" +
                " username='" + getUsername() + "'" +
                ", password='" + getPassword() + "'" +
                ", role='" + getRole() + "'" +
                "}";
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

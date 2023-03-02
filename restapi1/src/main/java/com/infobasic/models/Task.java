package com.infobasic.models;

public class Task {
    private int id;
    private String name;
    private String state;
    private String date;
    private User user;

    public Task(int id, String name, String state, String date, User user) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.date = date;
        this.user = user;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", state='" + getState() + "'" +
                ", date='" + getDate() + "'" +
                ", user='" + getUser() + "'" +
                "}";
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

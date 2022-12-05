package com.infobasic.models;

public class Activity {
    private int id;
    private String type;
    private String description;
    private String date;
    private String time;
    private User user;

    public Activity(int id, String type, String description, String date, String time, User user) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.date = date;
        this.time = time;
        this.user = user;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", type='" + getType() + "'" +
                ", description='" + getDescription() + "'" +
                ", date='" + getDate() + "'" +
                ", time='" + getTime() + "'" +
                ", user='" + getUser() + "'" +
                "}";
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

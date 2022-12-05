package com.infobasic.models;

public class Ticket {
    private int id;
    private String title;
    private String comment;
    private String description;
    private String opening_date;
    private User user;

    public Ticket(int id, String title, String comment, String description, String opening_date, User user) {
        this.id = id;
        this.title = title;
        this.comment = comment;
        this.description = description;
        this.opening_date = opening_date;
        this.user = user;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", title='" + getTitle() + "'" +
                ", comment='" + getComment() + "'" +
                ", description='" + getDescription() + "'" +
                ", opening_date='" + getOpening_date() + "'" +
                ", user='" + getUser() + "'" +
                "}";
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOpening_date() {
        return this.opening_date;
    }

    public void setOpening_date(String opening_date) {
        this.opening_date = opening_date;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

package com.infobasic.models;

public class Deal {
    private int id;
    private String name;
    private String type;
    private String state;
    private double amount;
    private String closing_date;
    private Lead lead;
    private User user;

    public Deal(int id, String name, String type, String state, double amount, String closing_date, Lead lead,
            User user) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.state = state;
        this.amount = amount;
        this.closing_date = closing_date;
        this.lead = lead;
        this.user = user;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", type='" + getType() + "'" +
                ", state='" + getState() + "'" +
                ", amount='" + getAmount() + "'" +
                ", closing_date='" + getClosing_date() + "'" +
                ", lead='" + getLead() + "'" +
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

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getClosing_date() {
        return this.closing_date;
    }

    public void setClosing_date(String closing_date) {
        this.closing_date = closing_date;
    }

    public Lead getLead() {
        return this.lead;
    }

    public void setLead(Lead lead) {
        this.lead = lead;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

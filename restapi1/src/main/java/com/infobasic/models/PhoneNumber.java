package com.infobasic.models;

public class PhoneNumber {
    private int id;
    private String number;

    public PhoneNumber(int id, String number) {
        this.id = id;
        this.number = number;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", number='" + getNumber() + "'" +
                "}";
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

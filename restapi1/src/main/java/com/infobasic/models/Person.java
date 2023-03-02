package com.infobasic.models;

public class Person {
    private int id;
    private String cf;
    private String firstname;
    private String lastname;
    private String fax;
    private String job;

    public Person(int id, String cf, String firstname, String lastname, String fax, String job) {
        this.id = id;
        this.cf = cf;
        this.firstname = firstname;
        this.lastname = lastname;
        this.fax = fax;
        this.job = job;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", cf='" + getCf() + "'" +
                ", firstname='" + getFirstname() + "'" +
                ", lastname='" + getLastname() + "'" +
                ", fax='" + getFax() + "'" +
                ", job='" + getJob() + "'" +
                "}";
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCf() {
        return this.cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFax() {
        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}

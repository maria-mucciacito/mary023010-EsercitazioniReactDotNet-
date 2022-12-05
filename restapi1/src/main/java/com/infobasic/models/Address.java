package com.infobasic.models;

public class Address {
    private int id;
    private String state;
    private String city;
    private String street;
    private int house_number;
    private int post_code;
    private Person person;
    private Company company;

    public Address(int id, String state, String city, String street, int house_number, int post_code, Person person,
            Company company) {
        this.id = id;
        this.state = state;
        this.city = city;
        this.street = street;
        this.house_number = house_number;
        this.post_code = post_code;
        this.person = person;
        this.company = company;
    }

    public Address(int id, String state, String city, String street, int house_number, int post_code) {
        this.id = id;
        this.state = state;
        this.city = city;
        this.street = street;
        this.house_number = house_number;
        this.post_code = post_code;
    }

    public Address(int id, String state, String city, String street, int house_number, int post_code, Person person) {
        this.id = id;
        this.state = state;
        this.city = city;
        this.street = street;
        this.house_number = house_number;
        this.post_code = post_code;
        this.person = person;
    }

    public Address(int id, String state, String city, String street, int house_number, int post_code, Company company) {
        this.id = id;
        this.state = state;
        this.city = city;
        this.street = street;
        this.house_number = house_number;
        this.post_code = post_code;
        this.company = company;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", state='" + getState() + "'" +
                ", city='" + getCity() + "'" +
                ", street='" + getStreet() + "'" +
                ", house_number='" + getHouse_number() + "'" +
                ", post_code='" + getPost_code() + "'" +
                ", person='" + getPerson() + "'" +
                ", company='" + getCompany() + "'" +
                "}";
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse_number() {
        return this.house_number;
    }

    public void setHouse_number(int house_number) {
        this.house_number = house_number;
    }

    public int getPost_code() {
        return this.post_code;
    }

    public void setPost_code(int post_code) {
        this.post_code = post_code;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}

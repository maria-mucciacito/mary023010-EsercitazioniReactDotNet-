package com.infobasic.models;

import java.text.SimpleDateFormat;

public class Contact extends Person {
    private SimpleDateFormat birthday_date;
    private Company company;

    public Contact(int id, String cf, String firstname, String lastname, String fax, String job,
            SimpleDateFormat birthday_date, Company company) {
        super(id, cf, firstname, lastname, fax, job);
        this.birthday_date = birthday_date;
        this.company = company;
    }

    public Contact(int id, String cf, String firstname, String lastname, String fax, String job,
            SimpleDateFormat birthday_date) {
        super(id, cf, firstname, lastname, fax, job);
        this.birthday_date = birthday_date;

    }

    @Override
    public String toString() {
        return "{" +
                " birthday_date='" + getBirthday_date() + "'" +
                "}";
    }

    public SimpleDateFormat getBirthday_date() {
        return this.birthday_date;
    }

    public void setBirthday_date(SimpleDateFormat birthday_date) {
        this.birthday_date = birthday_date;
    }

    public Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}

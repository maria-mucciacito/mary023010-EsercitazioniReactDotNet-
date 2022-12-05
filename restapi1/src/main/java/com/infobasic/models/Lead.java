package com.infobasic.models;

public class Lead extends Person {
    private String interest;
    private String source;

    public Lead(int id, String cf, String firstname, String lastname, String fax, String job, String interest,
            String source) {
        super(id, cf, firstname, lastname, fax, job);
        this.interest = interest;
        this.source = source;
    }

    @Override
    public String toString() {
        return "{" +
                " interest='" + getInterest() + "'" +
                ", source='" + getSource() + "'" +
                "}";
    }

    public String getInterest() {
        return this.interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}

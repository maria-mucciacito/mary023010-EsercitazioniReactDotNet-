package com.infobasic.models;

public class Subscription {
    private int id;
    private String activation_code;
    private String name_subscription;
    private String type;
    private double price;
    private String description;
    private String start_date;
    private String end_date;
    private SoftwarePackage software;
    private Company company;

    public Subscription(int id, String activation_code, String name_subscription, String type, double price,
            String description, String start_date, String end_date, SoftwarePackage software, Company company) {
        this.id = id;
        this.activation_code = activation_code;
        this.name_subscription = name_subscription;
        this.type = type;
        this.price = price;
        this.description = description;
        this.start_date = start_date;
        this.end_date = end_date;
        this.software = software;
        this.company = company;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", activation_code='" + getActivation_code() + "'" +
                ", name_subscription='" + getName_subscription() + "'" +
                ", type='" + getType() + "'" +
                ", price='" + getPrice() + "'" +
                ", description='" + getDescription() + "'" +
                ", start_date='" + getStart_date() + "'" +
                ", end_date='" + getEnd_date() + "'" +
                ", software='" + getSoftware() + "'" +
                ", company='" + getCompany() + "'" +
                "}";
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActivation_code() {
        return this.activation_code;
    }

    public void setActivation_code(String activation_code) {
        this.activation_code = activation_code;
    }

    public String getName_subscription() {
        return this.name_subscription;
    }

    public void setName_subscription(String name_subscription) {
        this.name_subscription = name_subscription;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStart_date() {
        return this.start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return this.end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public SoftwarePackage getSoftware() {
        return this.software;
    }

    public void setSoftware(SoftwarePackage software) {
        this.software = software;
    }

    public Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}

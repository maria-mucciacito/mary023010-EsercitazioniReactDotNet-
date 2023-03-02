package com.infobasic.models;

public class Company {
    private int id;
    private String name;
    private String fax;
    private String business_area;
    private String sito_web;
    private String p_iva;

    public Company(int id, String name, String fax, String business_area, String sito_web, String p_iva) {
        this.id = id;
        this.name = name;
        this.fax = fax;
        this.business_area = business_area;
        this.sito_web = sito_web;
        this.p_iva = p_iva;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", fax='" + getFax() + "'" +
                ", business_area='" + getBusiness_area() + "'" +
                ", sito_web='" + getSito_web() + "'" +
                ", p_iva='" + getP_iva() + "'" +
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

    public String getFax() {
        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getBusiness_area() {
        return this.business_area;
    }

    public void setBusiness_area(String business_area) {
        this.business_area = business_area;
    }

    public String getSito_web() {
        return this.sito_web;
    }

    public void setSito_web(String sito_web) {
        this.sito_web = sito_web;
    }

    public String getP_iva() {
        return this.p_iva;
    }

    public void setP_iva(String p_iva) {
        this.p_iva = p_iva;
    }
}

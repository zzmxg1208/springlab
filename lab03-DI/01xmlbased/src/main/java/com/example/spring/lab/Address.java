package com.example.spring.lab;

/**
 * Created by zzhang4 on 2020/12/10
 */
public class Address {
    private int id;
    private String country;
    private String street;
    private String zip;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    public String toString(){
        return "[id:"+id+",country:"+country+",street:"+street+",zip:"+zip+"]";
    }
}

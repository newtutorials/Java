package org.newtutorials.java.xml.jaxb.pojo;

/**
 * Created by daniel.g on 09/05/2017.
 */
public class Address {
    private String city;
    private String county;
    private String street;

    public Address() {
    }

    public Address(String city, String county, String street) {
        this.city = city;
        this.county = county;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}

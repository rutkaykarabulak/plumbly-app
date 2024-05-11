package com.plumbly.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Company {
    @Id
    private String id;
    private String location;
    private String phoneNumber;
    private String addressId;

    public Company(String location, String phoneNumber, String addressId) {
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.addressId = addressId;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", location='" + location + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", addressId='" + addressId + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }
}

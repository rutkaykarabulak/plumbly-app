package com.plumbly.plumbly.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Company {
    @Id
    private String id;
    private String location;
    private String phoneNumber;
    private String addressId;

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", location='" + location + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", addressId='" + addressId + '\'' +
                '}';
    }
}

package com.plumbly.plumbly.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Address {
    @Id
    private String id;
    private String streetName;
    private String door;
    private String floor;
    private String postalCode;
    private String city;
    private String countryId;

    @Override
    public String toString() {
        return "Address{" +
                "id='" + id + '\'' +
                ", streetName='" + streetName + '\'' +
                ", door='" + door + '\'' +
                ", floor='" + floor + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", countryId='" + countryId + '\'' +
                '}';
    }
}

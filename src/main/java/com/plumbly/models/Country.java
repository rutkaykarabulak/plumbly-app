package com.plumbly.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Country {
    @Id
    private String id;
    private String name;
    private String isoCode;
    private String phonePrefix;

    public Country(String name, String isoCode, String phonePrefix) {
        this.name = name;
        this.isoCode = isoCode;
        this.phonePrefix = phonePrefix;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", isoCode='" + isoCode + '\'' +
                ", phonePrefix='" + phonePrefix + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getPhonePrefix() {
        return phonePrefix;
    }

    public void setPhonePrefix(String phonePrefix) {
        this.phonePrefix = phonePrefix;
    }
}


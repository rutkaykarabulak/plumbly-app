package com.plumbly.plumbly.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Country {
    @Id
    private String id;
    private String name;
    private String isoCode;
    private String phonePrefix;

    @Override
    public String toString() {
        return "Country{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", isoCode='" + isoCode + '\'' +
                ", phonePrefix='" + phonePrefix + '\'' +
                '}';
    }
}


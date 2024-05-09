package com.plumbly.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Profession {
    @Id
    private String id;
    private String name;
    private boolean requiresCertificate;

    @Override
    public String toString() {
        return "Profession{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", requiresCertificate=" + requiresCertificate +
                '}';
    }
}

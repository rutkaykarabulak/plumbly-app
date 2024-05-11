package com.plumbly.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("professions")
public class Profession {
    @Id
    private String id;
    private String name;
    private boolean requiresCertificate;

    public Profession(String name, boolean requiresCertificate) {
        this.name = name;
        this.requiresCertificate = requiresCertificate;
    }

    @Override
    public String toString() {
        return "Profession{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", requiresCertificate=" + requiresCertificate +
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

    public boolean isRequiresCertificate() {
        return requiresCertificate;
    }

    public void setRequiresCertificate(boolean requiresCertificate) {
        this.requiresCertificate = requiresCertificate;
    }
}

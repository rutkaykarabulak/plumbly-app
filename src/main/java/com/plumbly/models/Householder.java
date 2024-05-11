package com.plumbly.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document
public class Householder {
    @Id
    private String id;
    private List<Profession> preferredTechnicians;
    private String userId;

    public Householder(List<Profession> preferredTechnicians, String userId) {
        this.preferredTechnicians = preferredTechnicians;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Householder{" +
                "id='" + id + '\'' +
                ", preferredTechnicians=" + preferredTechnicians +
                ", userId='" + userId + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Profession> getPreferredTechnicians() {
        return preferredTechnicians;
    }

    public void setPreferredTechnicians(List<Profession> preferredTechnicians) {
        this.preferredTechnicians = preferredTechnicians;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

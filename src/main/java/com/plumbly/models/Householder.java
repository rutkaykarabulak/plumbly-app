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

    @Override
    public String toString() {
        return "Householder{" +
                "id='" + id + '\'' +
                ", preferredTechnicians=" + preferredTechnicians +
                ", userId='" + userId + '\'' +
                '}';
    }
}

package com.plumbly.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.plumbly.utils.YearsOfExperience;

@Document
public class Technician {
    @Id
    private String id;
    private String companyId;
    private String profession;
    private String secondProfession;
    private YearsOfExperience yearsOfExperience;
    private String userId;
    
    @Override
    public String toString() {
        return "Technician{" +
                "id='" + id + '\'' +
                ", companyId='" + companyId + '\'' +
                ", profession='" + profession + '\'' +
                ", secondProfession='" + secondProfession + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", userId='" + userId + '\'' +
                '}';
    }
}

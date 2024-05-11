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
    
    public Technician(String companyId, String profession, String secondProfession, YearsOfExperience yearsOfExperience,
            String userId) {
        this.companyId = companyId;
        this.profession = profession;
        this.secondProfession = secondProfession;
        this.yearsOfExperience = yearsOfExperience;
        this.userId = userId;
    }

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getSecondProfession() {
        return secondProfession;
    }

    public void setSecondProfession(String secondProfession) {
        this.secondProfession = secondProfession;
    }

    public YearsOfExperience getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(YearsOfExperience yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

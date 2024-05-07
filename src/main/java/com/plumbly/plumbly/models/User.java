package com.plumbly.plumbly.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.plumbly.plumbly.models.shared.UserType;

import java.util.Date;

@Document
public class User {
    @Id
    private String id;
    private String fullName;
    private Date birthDate;
    private String personalPhoneNumber;
    private String profilePhotoId;
    private String email;
    private UserType userType;
    private String technicianId;
    private String householderId;

    public User() {
    }

    public User(String fullName, Date birthDate, String personalPhoneNumber, String profilePhotoId, String email, UserType userType, String technicianId, String householderId) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.personalPhoneNumber = personalPhoneNumber;
        this.profilePhotoId = profilePhotoId;
        this.email = email;
        this.userType = userType;
        this.technicianId = technicianId;
        this.householderId = householderId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPersonalPhoneNumber() {
        return personalPhoneNumber;
    }

    public void setPersonalPhoneNumber(String personalPhoneNumber) {
        this.personalPhoneNumber = personalPhoneNumber;
    }

    public String getProfilePhotoId() {
        return profilePhotoId;
    }

    public void setProfilePhotoId(String profilePhotoId) {
        this.profilePhotoId = profilePhotoId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getTechnicianId() {
        return technicianId;
    }

    public void setTechnicianId(String technicianId) {
        this.technicianId = technicianId;
    }

    public String getHouseholderId() {
        return householderId;
    }

    public void setHouseholderId(String householderId) {
        this.householderId = householderId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                ", personalPhoneNumber='" + personalPhoneNumber + '\'' +
                ", profilePhotoId='" + profilePhotoId + '\'' +
                ", email='" + email + '\'' +
                ", userType=" + userType +
                ", technicianId='" + technicianId + '\'' +
                ", householderId='" + householderId + '\'' +
                '}';
    }
}

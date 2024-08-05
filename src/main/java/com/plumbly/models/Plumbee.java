package com.plumbly.models;
import java.time.LocalDateTime;

import com.plumbly.utils.UserType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Table(name = "plumbee")
public class Plumbee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @OneToOne
    @JoinColumn(name = "login_id")
    private Login login;
    @Column(name = "fullname")
    private String fullname;
    @Column(name = "email")
    private String email;
    @Column(name = "birthdate")
    private LocalDateTime birthdate;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "profile_photo_id")
    private String profilePhotoId;
    @Column(name = "user_type")
    private UserType userType;
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
}

package com.plumbly.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "street_name")
    private String streetName;
    @Column(name = "door")
    private String door;
    @Column(name = "floor")
    private String floor;
    @Column(name = "postal_code")
    private String postalCode;
    @Column(name = "city")
    private String city;
    @OneToOne
    @JoinColumn(name = "country_id")
    private Country country;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "longitude")
    private double longitude;
    @Column(name = "latitude")
    private double latitude;
}

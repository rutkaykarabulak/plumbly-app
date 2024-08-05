package com.plumbly.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "technician")
public class Technician {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plumbee_id")
    private Plumbee plumbee;
    
    @OneToOne
    @JoinColumn(name = "profession_id")
    private Profession profession;
    
    @OneToOne
    @JoinColumn(name = "second_profession_id")
    private Profession secondProfession;

    @OneToOne
    @JoinColumn(name = "years_of_experience_id")
    private YearsOfExperience yearsOfExperience;
}

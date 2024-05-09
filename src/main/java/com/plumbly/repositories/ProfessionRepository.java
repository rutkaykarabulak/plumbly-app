package com.plumbly.repositories;

import org.springframework.data.repository.CrudRepository;

import com.plumbly.models.Profession;

public interface ProfessionRepository extends CrudRepository<Profession, String>{
    
}

package com.plumbly.plumbly.repositories;

import org.springframework.data.repository.CrudRepository;

import com.plumbly.plumbly.models.Profession;

public interface ProfessionRepository extends CrudRepository<Profession, String>{
    
}

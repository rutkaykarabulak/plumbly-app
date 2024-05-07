package com.plumbly.plumbly.repositories;

import org.springframework.data.repository.CrudRepository;

import com.plumbly.plumbly.models.Householder;

public interface HouseholderRepository extends CrudRepository<Householder, String>{
    
}

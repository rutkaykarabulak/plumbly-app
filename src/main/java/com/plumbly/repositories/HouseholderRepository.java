package com.plumbly.repositories;

import org.springframework.data.repository.CrudRepository;

import com.plumbly.models.Householder;

public interface HouseholderRepository extends CrudRepository<Householder, String>{
    
}

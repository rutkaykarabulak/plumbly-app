package com.plumbly.plumbly.repositories;

import org.springframework.data.repository.CrudRepository;

import com.plumbly.plumbly.models.Country;

public interface CountryRepository extends CrudRepository<Country, String>{
    
}

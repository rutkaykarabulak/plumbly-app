package com.plumbly.repositories;

import org.springframework.data.repository.CrudRepository;

import com.plumbly.models.Company;

public interface CompanyRepository extends CrudRepository<Company, String>{
    
}

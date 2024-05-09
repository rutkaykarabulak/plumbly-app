package com.plumbly.repositories;

import org.springframework.data.repository.CrudRepository;

import com.plumbly.models.Address;

public interface AddressRepository extends CrudRepository<Address, String>{
    
}

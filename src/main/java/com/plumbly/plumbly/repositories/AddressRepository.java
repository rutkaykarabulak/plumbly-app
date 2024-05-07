package com.plumbly.plumbly.repositories;

import org.springframework.data.repository.CrudRepository;

import com.plumbly.plumbly.models.Address;

public interface AddressRepository extends CrudRepository<Address, String>{
    
}

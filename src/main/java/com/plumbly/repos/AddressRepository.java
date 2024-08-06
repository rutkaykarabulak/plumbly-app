package com.plumbly.repos;

import org.springframework.data.repository.CrudRepository;

import com.plumbly.models.Address;

public interface AddressRepository extends CrudRepository<Address, Integer>{}

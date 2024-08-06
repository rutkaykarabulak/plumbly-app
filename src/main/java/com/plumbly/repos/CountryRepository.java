package com.plumbly.repos;

import org.springframework.data.repository.CrudRepository;

import com.plumbly.models.Country;

public interface CountryRepository extends CrudRepository<Country, Integer>{}

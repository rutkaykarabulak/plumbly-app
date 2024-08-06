package com.plumbly.repos;

import org.springframework.data.repository.CrudRepository;

import com.plumbly.models.Plumbee;

public interface PlumbeeRepository extends CrudRepository<Plumbee, Integer> {}

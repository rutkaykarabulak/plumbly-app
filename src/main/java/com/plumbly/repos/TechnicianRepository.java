package com.plumbly.repos;

import org.springframework.data.repository.CrudRepository;

import com.plumbly.models.Technician;

public interface TechnicianRepository extends CrudRepository<Technician, Integer>{}

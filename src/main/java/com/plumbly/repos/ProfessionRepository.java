package com.plumbly.repos;

import org.springframework.data.repository.CrudRepository;

import com.plumbly.models.Profession;

public interface ProfessionRepository extends CrudRepository<Profession, Integer>{}

package com.plumbly.repos;

import org.springframework.data.repository.CrudRepository;

import com.plumbly.models.Login;

public interface LoginRepository extends CrudRepository<Login, Integer>{}

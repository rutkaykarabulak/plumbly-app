package com.plumbly.plumbly.repositories;

import org.springframework.data.repository.CrudRepository;

import com.plumbly.plumbly.models.User;

public interface UserRepository extends CrudRepository<User, String> {
    
}

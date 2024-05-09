package com.plumbly.repositories;

import org.springframework.data.repository.CrudRepository;

import com.plumbly.models.User;

public interface UserRepository extends CrudRepository<User, String> {
    
}

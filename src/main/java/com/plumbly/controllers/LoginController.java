package com.plumbly.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.plumbly.models.Login;
import com.plumbly.repos.LoginRepository;

@RestController
public class LoginController {
    private LoginRepository loginRepository;

    public LoginController(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @GetMapping("/login/{id}")
    public Login get(@PathVariable int id) {
        Optional<Login> login = loginRepository.findById(id);

        return login.get();
    }
}

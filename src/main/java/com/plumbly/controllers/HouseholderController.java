package com.plumbly.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.plumbly.models.Householder;
import com.plumbly.repos.HouseholderRepository;

@RestController
public class HouseholderController {
    private HouseholderRepository householderRepository;
    
    public HouseholderController(HouseholderRepository householderRepository) {
        this.householderRepository = householderRepository;
    }

    @GetMapping("/householder/{id}")
    public Householder get(@PathVariable int id) {
        return householderRepository.findById(id).get();
    }
}

package com.plumbly.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.plumbly.models.Plumbee;
import com.plumbly.repos.PlumbeeRepository;

@RestController
public class PlumbeeController {
    private PlumbeeRepository plumbeeRepository;

    public PlumbeeController(PlumbeeRepository plumbeeRepository) {
        this.plumbeeRepository = plumbeeRepository;
    }

    @GetMapping("/plumbee/{id}")
    public Plumbee get(@PathVariable int id) {
        return plumbeeRepository.findById(id).get();
    }
}

package com.plumbly.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.plumbly.models.Technician;
import com.plumbly.repos.TechnicianRepository;

@RestController
public class TechnicianController {
    private TechnicianRepository technicianRepository;

    public TechnicianController(TechnicianRepository technicianRepository) {
        this.technicianRepository = technicianRepository;
    }

    @GetMapping("/technician/{id}")
    public Technician get(@PathVariable int id) {
            return technicianRepository.findById(id).get();
    }
}

package com.plumbly.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.plumbly.models.Profession;
import com.plumbly.repos.ProfessionRepository;

@RestController
public class ProfessionController {
    private ProfessionRepository professionRepository;

    public ProfessionController(ProfessionRepository professionRepository) {
        this.professionRepository = professionRepository;
    }

    @GetMapping("/profession/{id}")
    public Profession get(@PathVariable int id) {
        Optional<Profession> profession = professionRepository.findById(id);

        return profession.get();
    }
}

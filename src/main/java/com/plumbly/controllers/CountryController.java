package com.plumbly.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.plumbly.models.Country;
import com.plumbly.repos.CountryRepository;

@RestController
public class CountryController {
    private CountryRepository countryRepository;

    public CountryController(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @GetMapping("/country/{id}")
    public Country get(@PathVariable int id) {
        return countryRepository.findById(id).get();
    }
}

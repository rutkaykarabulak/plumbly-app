package com.plumbly.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.plumbly.models.Company;
import com.plumbly.repos.CompanyRepository;

@RestController
public class CompanyController {
    private CompanyRepository companyRepository;

    public CompanyController(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @GetMapping("/company/{id}")
    public Company get(@PathVariable int id) {
        return companyRepository.findById(id).get();
    }
}

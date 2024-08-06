package com.plumbly.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.plumbly.models.Address;
import com.plumbly.repos.AddressRepository;

@RestController
public class AddressController {
    private AddressRepository addressRepository;

    public AddressController(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @GetMapping("/address/{id}")
    public Address get(@PathVariable int id) {
        Optional<Address> address = addressRepository.findById(id);

        return address.get();
    }
}

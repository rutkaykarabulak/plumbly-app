package com.plumbly.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.client.MongoClient;
import com.plumbly.models.Profession;
import com.plumbly.repositories.ProfessionRepository;
@RestController
public class PlumblyController {
private static final Log log = LogFactory.getLog(PlumblyController.class);

@Autowired
private MongoClient mongo;
@Autowired
private MongoOperations mongoTemplate;
@Autowired
private ProfessionRepository professionRepository;

@GetMapping("/")
public String get() {
    Profession p = new Profession("Plumber", false);
    professionRepository.save(p);
    log.info("Inserting the object..." + p.getName());
    mongoTemplate.dropCollection("profession");
    return "Welcome!";
    }
}

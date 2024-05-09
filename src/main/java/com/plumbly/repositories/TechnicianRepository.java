package com.plumbly.repositories;

import org.springframework.data.repository.CrudRepository;
import com.plumbly.models.Technician;

public interface TechnicianRepository extends CrudRepository<Technician, String>{
    
}

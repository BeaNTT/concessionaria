package com.ntt.concessionaria.repositories;

import com.ntt.concessionaria.models.Auto;

import org.springframework.data.repository.CrudRepository;

public interface AutoRep extends CrudRepository<Auto,Long> {
    
}

package com.marcos.cheapgas.services;

import java.util.Optional;

import com.marcos.cheapgas.domain.Valor;
import com.marcos.cheapgas.repositories.ValorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValorServices {
    
    @Autowired
    private ValorRepository repository;

    public Valor findById(Integer id){
        Optional<Valor> obj = repository.findById(id);
        return obj.orElse(null);        
        
    }
}

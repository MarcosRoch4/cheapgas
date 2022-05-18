package com.marcos.cheapgas.services;

import java.util.Optional;

import com.marcos.cheapgas.domain.Combustivel;
import com.marcos.cheapgas.repositories.CombustivelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CombustivelServices {

    @Autowired
    private CombustivelRepository repository;

    public Combustivel findById(Integer id){
        Optional<Combustivel> obj = repository.findById(id);
        return obj.orElse(null);
    }
    
}

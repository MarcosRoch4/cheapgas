package com.marcos.cheapgas.services;

import java.util.Optional;

import com.marcos.cheapgas.domain.PostoCombustivel;
import com.marcos.cheapgas.repositories.PostoCombustivelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostoCombustivelServices {
    
    
    @Autowired
    private PostoCombustivelRepository repository;

    public PostoCombustivel findById(Integer id){
        Optional<PostoCombustivel> obj = repository.findById(id);
        return obj.orElse(null);        
        
    }
}

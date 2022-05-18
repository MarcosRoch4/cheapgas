package com.marcos.cheapgas.services;

import java.util.Optional;

import com.marcos.cheapgas.domain.Localizacao;
import com.marcos.cheapgas.repositories.LocalizacaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalizacaoServices {

    @Autowired
    private LocalizacaoRepository repository;

    public Localizacao findById(Integer id){
        Optional<Localizacao> obj = repository.findById(id);
        return obj.orElse(null);        
        
    }

}

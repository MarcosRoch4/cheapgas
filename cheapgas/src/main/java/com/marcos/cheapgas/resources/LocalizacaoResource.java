package com.marcos.cheapgas.resources;

import com.marcos.cheapgas.domain.Localizacao;
import com.marcos.cheapgas.services.LocalizacaoServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/localizacao")
public class LocalizacaoResource {
    
    @Autowired
    private LocalizacaoServices service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Localizacao> findById(@PathVariable Integer id){
        Localizacao obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
        
    }
}

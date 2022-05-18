package com.marcos.cheapgas.resources;

import com.marcos.cheapgas.domain.Combustivel;
import com.marcos.cheapgas.services.CombustivelServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/combustivel")
public class CombustivelResource {

    @Autowired
    private CombustivelServices service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Combustivel> findById(@PathVariable Integer id){
        Combustivel obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}

//localhost:8090/combustivel/1

package com.marcos.cheapgas.resources;

import com.marcos.cheapgas.domain.Valor;
import com.marcos.cheapgas.services.ValorServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/valor")
public class ValorResource {

    @Autowired
    private ValorServices service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Valor> findById(@PathVariable Integer id){
        Valor obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    
}

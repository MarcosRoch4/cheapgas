package com.marcos.cheapgas.resources;

import com.marcos.cheapgas.domain.PostoCombustivel;
import com.marcos.cheapgas.services.PostoCombustivelServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/postocombustivel")
public class PostoCombustivelResource {

    @Autowired
    private PostoCombustivelServices service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<PostoCombustivel> findById(@PathVariable Integer id){
        PostoCombustivel obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}

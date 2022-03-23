package com.marcos.cheapgas.repositories;

import com.marcos.cheapgas.domain.PostoCombustivel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostoCombustivelRepository extends JpaRepository<PostoCombustivel, Integer>{
    
}

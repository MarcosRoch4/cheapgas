package com.marcos.cheapgas.repositories;

import com.marcos.cheapgas.domain.Combustivel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CombustivelRepository extends JpaRepository<Combustivel, Integer>{
    
}

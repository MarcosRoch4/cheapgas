package com.marcos.cheapgas.repositories;

import com.marcos.cheapgas.domain.Posto_Combustivel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Posto_CombustivelRepository extends JpaRepository<Posto_Combustivel, Integer>{
    
}

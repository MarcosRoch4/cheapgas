package com.marcos.cheapgas.repositories;

import com.marcos.cheapgas.domain.Localizacao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalizacaoRepository extends JpaRepository <Localizacao, Integer>{
    
}

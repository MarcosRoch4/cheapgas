
package com.marcos.cheapgas.repositories;

import com.marcos.cheapgas.domain.Valor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValorRepository extends JpaRepository<Valor, Integer>{
    
}

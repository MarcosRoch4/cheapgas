package com.marcos.cheapgas.config;

import com.marcos.cheapgas.services.DDBService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

    @Autowired
    private DDBService dbService;

    @Bean
    public void instaciaBaseDeDados(){
        this.dbService.instaciaBaseDeDados();
    }
    
}

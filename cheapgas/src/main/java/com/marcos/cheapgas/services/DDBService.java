package com.marcos.cheapgas.services;

import java.util.Arrays;

import com.marcos.cheapgas.domain.Combustivel;
import com.marcos.cheapgas.domain.Localizacao;
import com.marcos.cheapgas.domain.PostoCombustivel;
import com.marcos.cheapgas.domain.Valor;
import com.marcos.cheapgas.repositories.CombustivelRepository;
import com.marcos.cheapgas.repositories.LocalizacaoRepository;
import com.marcos.cheapgas.repositories.PostoCombustivelRepository;
import com.marcos.cheapgas.repositories.ValorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DDBService {

    @Autowired
	private LocalizacaoRepository localizacaoRepository;

	@Autowired
	private PostoCombustivelRepository postoCombustivelRepository;

	@Autowired
	private CombustivelRepository combustivelRepository;

	@Autowired
	private ValorRepository valorRepository;

    public void instaciaBaseDeDados(){

        Localizacao loc1 = new Localizacao(null,"Perto de casa");
		PostoCombustivel pc1 = new PostoCombustivel(null, "SHELL",loc1);
		Combustivel con1 = new Combustivel(null,"Gasolina");
		Combustivel con2 = new Combustivel(null,"Etanol");
		Combustivel con3 = new Combustivel(null,"Diesel");
		Valor val1 = new Valor(null, 7.8,pc1,con1);
		Valor val2 = new Valor(null, 6.75,pc1,con2);
		Valor val3 = new Valor(null, 7.2,pc1,con3);


		loc1.getPostoCombustivel().addAll(Arrays.asList(pc1));

		this.localizacaoRepository.saveAll(Arrays.asList(loc1));
		this.postoCombustivelRepository.saveAll(Arrays.asList(pc1));
		this.combustivelRepository.saveAll(Arrays.asList(con1,con2,con3));
		this.valorRepository.saveAll(Arrays.asList(val1,val2,val3));
    }
    
}

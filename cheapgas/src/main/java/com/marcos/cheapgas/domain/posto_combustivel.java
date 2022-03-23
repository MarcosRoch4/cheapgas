package com.marcos.cheapgas.domain;

import java.util.ArrayList;
import java.util.List;

public class posto_combustivel {
    private Integer id;
    private String nome;
    
    private localizacao localizacao; 

    public posto_combustivel() {
        super();
    }  

    public posto_combustivel(Integer id, String nome, com.marcos.cheapgas.domain.localizacao localizacao) {
        this.id = id;
        this.nome = nome;
        this.localizacao = localizacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(localizacao localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        posto_combustivel other = (posto_combustivel) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    


    
}

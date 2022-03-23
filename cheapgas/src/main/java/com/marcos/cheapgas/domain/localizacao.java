package com.marcos.cheapgas.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class Localizacao {

    private Integer id;
    private String endereco;
    

  private List<Posto_combustivel> posto_combustivel = new ArrayList<>();

    
 

public Localizacao() {
     super();
}
    
public Localizacao(Integer id, String endereco) {
    this.id = id;
    this.endereco = endereco;
}

public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public String getEndereco() {
    return endereco;
}

public void setEndereco(String endereco) {
    this.endereco = endereco;
}

public List<Posto_combustivel> getPosto_combustivel() {
    return posto_combustivel;
}

public void setPosto_combustivel(List<Posto_combustivel> posto_combustivel) {
    this.posto_combustivel = posto_combustivel;
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
    Localizacao other = (Localizacao) obj;
    if (id == null) {
        if (other.id != null)
            return false;
    } else if (!id.equals(other.id))
        return false;
    return true;
}



    
}

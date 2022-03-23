package com.marcos.cheapgas.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Valor implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;    
    private Float valor;

    @ManyToOne
    @JoinColumn(name = "posto_combustivel_id")
    private Posto_combustivel posto_combustivel;

    @ManyToOne
    @JoinColumn(name = "combustivel_id")
    private Combustivel combustivel;

    public Valor() {
        super();
    }

    public Valor(Integer id, Float valor, Posto_combustivel posto_combustivel, Combustivel combustivel) {
        this.id = id;
        this.valor = valor;
        this.posto_combustivel = posto_combustivel;
        this.combustivel = combustivel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Posto_combustivel getPosto_combustivel() {
        return posto_combustivel;
    }

    public void setPosto_combustivel(Posto_combustivel posto_combustivel) {
        this.posto_combustivel = posto_combustivel;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
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
        Valor other = (Valor) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    
    
}


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
    private Double valor;

    @ManyToOne
    @JoinColumn(name = "postoCombustivel_id")
    private PostoCombustivel postoCombustivel;

    @ManyToOne
    @JoinColumn(name = "combustivel_id")
    private Combustivel combustivel;

    public Valor() {
        super();
    }

    public Valor(Integer id, double d, PostoCombustivel postoCombustivel, Combustivel combustivel) {
        this.id = id;
        this.valor = d;
        this.postoCombustivel = postoCombustivel;
        this.combustivel = combustivel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public PostoCombustivel getPostoCombustivel() {
        return postoCombustivel;
    }

    public void setPostoCombustivel(PostoCombustivel postoCombustivel) {
        this.postoCombustivel = postoCombustivel;
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

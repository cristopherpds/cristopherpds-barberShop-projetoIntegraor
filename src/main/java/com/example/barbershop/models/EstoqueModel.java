package com.example.barbershop.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estoque")
public class EstoqueModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private ProdutoModel produtos;

    public ProdutoModel getProdutos() {
        return produtos;
    }

    public void setProdutos(ProdutoModel produtos) {
        this.produtos = produtos;
    }
}

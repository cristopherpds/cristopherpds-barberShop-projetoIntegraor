package com.example.barbershop.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "relatorio")
public class RelatorioModel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String vendaPorDia;
    private String vendaPorFuncionario;
    private String produtosMaisVendidos;

    public String getVendaPorDia() {
        return vendaPorDia;
    }

    public void setVendaPorDia(String vendaPorDia) {
        this.vendaPorDia = vendaPorDia;
    }

    public String getVendaPorFuncionario() {
        return vendaPorFuncionario;
    }

    public void setVendaPorFuncionario(String vendaPorFuncionario) {
        this.vendaPorFuncionario = vendaPorFuncionario;
    }

    public String getProdutosMaisVendidos() {
        return produtosMaisVendidos;
    }

    public void setProdutosMaisVendidos(String produtosMaisVendidos) {
        this.produtosMaisVendidos = produtosMaisVendidos;
    }
}

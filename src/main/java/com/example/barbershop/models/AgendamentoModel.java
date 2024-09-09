package com.example.barbershop.models;


import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="agendamento")
public class AgendamentoModel implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    private LocalDate dataHoraAgendamento;
    private ClienteModel cliente;
    private ServicoModel service;
    private FuncionarioModel funcionario;


    public AgendamentoModel(LocalDate dataHoraAgendamento, ClienteModel cliente, ServicoModel service,
            FuncionarioModel funcionario) {
        this.dataHoraAgendamento = dataHoraAgendamento;
        this.cliente = cliente;
        this.service = service;
        this.funcionario = funcionario;
    }

    public  LocalDate getDataHoraAgendamento() {
        return dataHoraAgendamento;
    }

    public void setDataHoraAgendamento(LocalDate dataHoraAgendamento) {
        this.dataHoraAgendamento = dataHoraAgendamento;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public ServicoModel getService() {
        return service;
    }

    public void setService(ServicoModel service) {
        this.service = service;
    }

    public FuncionarioModel getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioModel funcionario) {
        this.funcionario = funcionario;
    }
}

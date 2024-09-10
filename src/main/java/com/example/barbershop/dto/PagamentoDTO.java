package com.example.barbershop.dto;

import java.time.LocalDate;

public record PagamentoDTO(int id, int valor, LocalDate dataPagamento, String formaPagamento) {}

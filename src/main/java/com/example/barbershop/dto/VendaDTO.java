package com.example.barbershop.dto;

import java.time.LocalDate;

public record VendaDTO(int id, LocalDate dataVenda, ClienteDTO cliente, ProdutoDTO items, FuncionarioDTO funcionario) {
    
}

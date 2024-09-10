package com.example.barbershop.dto;

import java.time.LocalDate;

public record FuncionarioDTO( int id, String nome, String cargo, Double salario, Double commissao, LocalDate horario) {}

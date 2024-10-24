package com.example.barbershop.utils;

import com.example.barbershop.interfaces.ValidatorStrategy;

public class CPFValidatorStrategy implements ValidatorStrategy{
    @Override
    public boolean validate(String cpf) {
        return CPFValidator.isCPF(cpf);
    }
}

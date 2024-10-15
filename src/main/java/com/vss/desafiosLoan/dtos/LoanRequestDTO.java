package com.vss.desafiosLoan.dtos;

public record LoanRequestDTO(int age,
                             String cpf,
                             String name,
                             double income,
                             String location) {
}

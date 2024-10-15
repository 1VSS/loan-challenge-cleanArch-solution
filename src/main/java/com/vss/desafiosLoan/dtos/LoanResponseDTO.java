package com.vss.desafiosLoan.dtos;

import com.vss.desafiosLoan.domain.Loan;

import java.util.List;

public record LoanResponseDTO(String customer, List<Loan> loans) {
}

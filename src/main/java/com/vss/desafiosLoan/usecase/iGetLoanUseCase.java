package com.vss.desafiosLoan.usecase;

import com.vss.desafiosLoan.domain.Loan;
import com.vss.desafiosLoan.dtos.LoanRequestDTO;

import java.util.List;

public interface iGetLoanUseCase {

    public void checkPersonalLoan(LoanRequestDTO loanRequestDTO);

    public void checkGuaranteedLoan(LoanRequestDTO loanRequestDTO);

    public void checkConsignmentLoan(LoanRequestDTO loanRequestDTO);

    public List<Loan> calculateLoanApplication(LoanRequestDTO loanRequestDTO);
}

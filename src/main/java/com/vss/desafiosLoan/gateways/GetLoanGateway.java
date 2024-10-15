package com.vss.desafiosLoan.gateways;

import com.vss.desafiosLoan.dtos.LoanRequestDTO;
import com.vss.desafiosLoan.dtos.LoanResponseDTO;

public interface GetLoanGateway {

    LoanResponseDTO postLoanApplication(LoanRequestDTO loanRequestDTO);
}

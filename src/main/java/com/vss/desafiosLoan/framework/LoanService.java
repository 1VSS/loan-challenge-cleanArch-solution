//package com.vss.desafiosLoan.framework;
//
//import com.vss.desafiosLoan.dtos.LoanRequestDTO;
//import com.vss.desafiosLoan.dtos.LoanResponseDTO;
//import com.vss.desafiosLoan.gateways.GetLoanGateway;
//import com.vss.desafiosLoan.usecase.GetLoanUseCase;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//@Component
//public class LoanService implements GetLoanGateway {
//
//    private final GetLoanUseCase getLoanUseCase;
//
//    public LoanService(GetLoanUseCase getLoanUseCase) {
//        this.getLoanUseCase = getLoanUseCase;
//    }
//
//    @Override
//    public LoanResponseDTO postLoanApplication(LoanRequestDTO loanRequestDTO) {
//        var availableLoans = getLoanUseCase.calculateLoanApplication(loanRequestDTO);
//        return new LoanResponseDTO(loanRequestDTO.name(), availableLoans);
//    }
//}

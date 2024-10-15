package com.vss.desafiosLoan.usecase;

import com.vss.desafiosLoan.domain.Loan;
import com.vss.desafiosLoan.dtos.LoanRequestDTO;
import com.vss.desafiosLoan.gateways.GetLoanGateway;

import java.util.ArrayList;
import java.util.List;

public class GetLoanUseCase implements iGetLoanUseCase {

//    private final GetLoanGateway getLoanGateway;
//
//    public GetLoanUseCase(GetLoanGateway getLoanGateway) {
//        this.getLoanGateway = getLoanGateway;
//    }

    List<Loan> availableLoans = new ArrayList<>() {
    };


    @Override
    public void checkPersonalLoan(LoanRequestDTO loanRequestDTO) {
        if (loanRequestDTO.income() <= 3000 || loanRequestDTO.income() > 3000 && loanRequestDTO.income() < 5000 && loanRequestDTO.age() < 30 && loanRequestDTO.location().equalsIgnoreCase("sp")) {
            availableLoans.add(new Loan("PERSONAL", 4));
        }
    }

    @Override
    public void checkGuaranteedLoan(LoanRequestDTO loanRequestDTO) {
        if (loanRequestDTO.income() <= 3000 || loanRequestDTO.income() > 3000 && loanRequestDTO.income() < 5000 && loanRequestDTO.age() < 30 && loanRequestDTO.location().equalsIgnoreCase("sp")) {
            availableLoans.add(new Loan("GUARANTEED", 3));
        }

    }

    @Override
    public void checkConsignmentLoan(LoanRequestDTO loanRequestDTO) {
        if (loanRequestDTO.income() >= 5000) {
            availableLoans.add(new Loan("CONSIGNMENT", 2));
        }
    }

    @Override
    public List<Loan> calculateLoanApplication(LoanRequestDTO loanRequestDTO) {

        checkPersonalLoan(loanRequestDTO);
        checkGuaranteedLoan(loanRequestDTO);
        checkConsignmentLoan(loanRequestDTO);

        return availableLoans;
    }


}


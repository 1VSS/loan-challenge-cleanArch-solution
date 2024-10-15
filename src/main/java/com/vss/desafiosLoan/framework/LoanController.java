package com.vss.desafiosLoan.framework;

import com.vss.desafiosLoan.dtos.LoanRequestDTO;
import com.vss.desafiosLoan.dtos.LoanResponseDTO;
import com.vss.desafiosLoan.usecase.GetLoanUseCase;
import com.vss.desafiosLoan.usecase.iGetLoanUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/loan")
public class LoanController {

    private final iGetLoanUseCase getLoanUseCase;

    public LoanController(iGetLoanUseCase getLoanUseCase) {
        this.getLoanUseCase = getLoanUseCase;
    }

    @PostMapping
    public LoanResponseDTO PostLoanApplication(@RequestBody LoanRequestDTO loanRequestDTO) {
        var availableLoans = getLoanUseCase.calculateLoanApplication(loanRequestDTO);
        return new LoanResponseDTO(loanRequestDTO.name(), availableLoans);
    }
}

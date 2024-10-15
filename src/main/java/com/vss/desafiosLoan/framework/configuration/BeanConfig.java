package com.vss.desafiosLoan.framework.configuration;

import com.vss.desafiosLoan.domain.Loan;
import com.vss.desafiosLoan.gateways.GetLoanGateway;
import com.vss.desafiosLoan.usecase.GetLoanUseCase;
import com.vss.desafiosLoan.usecase.iGetLoanUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanConfig {

    @Bean
    public iGetLoanUseCase igetLoanUseCase() {
        return new GetLoanUseCase();
    }

}

package com.arquitetura.hexagonal.config;

import com.arquitetura.hexagonal.Application.core.usecase.FindCustomerByIdUseCase;
import com.arquitetura.hexagonal.adapters.out.FIndCustomerByIdAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
            FIndCustomerByIdAdapter fIndCustomerByIdAdapter
    ) {
        return new FindCustomerByIdUseCase(fIndCustomerByIdAdapter);
    }
}

package com.arquitetura.hexagonal.config;

import com.arquitetura.hexagonal.Application.core.usecase.DeleteCustomerByIdUseCase;
import com.arquitetura.hexagonal.Application.core.usecase.FindCustomerByIdUseCase;
import com.arquitetura.hexagonal.Application.core.usecase.UpdateCustomerUseCase;
import com.arquitetura.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase findCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter

    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}

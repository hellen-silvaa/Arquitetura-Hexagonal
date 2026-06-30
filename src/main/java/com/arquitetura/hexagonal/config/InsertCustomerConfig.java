package com.arquitetura.hexagonal.config;

import com.arquitetura.hexagonal.Application.core.usecase.InsertCustomerUseCase;
import com.arquitetura.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.arquitetura.hexagonal.adapters.out.InsertCustomerAdapter;
import com.arquitetura.hexagonal.adapters.out.SendCpfValidationAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationAdapter
    ) {
        return new InsertCustomerUseCase(insertCustomerAdapter, findAddressByZipCodeAdapter, sendCpfValidationAdapter);
    }
}

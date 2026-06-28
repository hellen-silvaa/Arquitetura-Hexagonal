package com.arquitetura.hexagonal.adapters.in.controller.mapper;

import com.arquitetura.hexagonal.Application.core.domain.Customer;
import com.arquitetura.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.arquitetura.hexagonal.adapters.in.controller.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "anddress", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}

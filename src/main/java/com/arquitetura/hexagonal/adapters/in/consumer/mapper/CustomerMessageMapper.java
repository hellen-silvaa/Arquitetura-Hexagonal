package com.arquitetura.hexagonal.adapters.in.consumer.mapper;

import com.arquitetura.hexagonal.Application.core.domain.Customer;
import com.arquitetura.hexagonal.adapters.in.consumer.message.CustomerMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "anddress", ignore = true)
    @Mapping(target = "validCpf", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);

    @Mapping(target = "zipCode", ignore = true)
    @Mapping(target = "isValidCpf", source = "validCpf")
    CustomerMessage toCustomerMessage(Customer customer);
}

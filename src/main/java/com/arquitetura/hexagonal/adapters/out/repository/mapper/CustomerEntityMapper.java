package com.arquitetura.hexagonal.adapters.out.repository.mapper;

import com.arquitetura.hexagonal.Application.core.domain.Customer;
import com.arquitetura.hexagonal.adapters.out.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    @Mapping(target = "address", source = "anddress")
    @Mapping(target = "isValidCpf", source = "validCpf")
    CustomerEntity toCustomerEntity(Customer customer);

    @Mapping(target = "anddress", source = "address")
    @Mapping(target = "validCpf", source = "isValidCpf")
    Customer toCustomer(CustomerEntity customerEntity);
}



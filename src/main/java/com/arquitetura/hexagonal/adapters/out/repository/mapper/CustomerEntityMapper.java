package com.arquitetura.hexagonal.adapters.out.repository.mapper;

import com.arquitetura.hexagonal.Application.core.domain.Customer;
import com.arquitetura.hexagonal.adapters.out.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}

package com.arquitetura.hexagonal.Application.ports.out;

import com.arquitetura.hexagonal.Application.core.domain.Customer;

public interface InsertCustomerOutputPort {
    void insert(Customer customer);

}

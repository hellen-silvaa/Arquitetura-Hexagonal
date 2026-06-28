package com.arquitetura.hexagonal.Application.ports.in;

import com.arquitetura.hexagonal.Application.core.domain.Customer;

public interface InsertCustomerINputPort {

    void insert(Customer customer, String zipCode);
}

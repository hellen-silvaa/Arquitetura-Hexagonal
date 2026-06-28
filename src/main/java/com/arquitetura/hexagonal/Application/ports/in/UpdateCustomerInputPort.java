package com.arquitetura.hexagonal.Application.ports.in;

import com.arquitetura.hexagonal.Application.core.domain.Customer;

public interface UpdateCustomerInputPort {
    void update(Customer customer, String zipCode);
}

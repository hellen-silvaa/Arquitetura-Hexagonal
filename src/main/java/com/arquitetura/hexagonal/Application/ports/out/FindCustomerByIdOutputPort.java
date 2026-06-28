package com.arquitetura.hexagonal.Application.ports.out;

import com.arquitetura.hexagonal.Application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {



    Optional<Customer> find(String id);
}

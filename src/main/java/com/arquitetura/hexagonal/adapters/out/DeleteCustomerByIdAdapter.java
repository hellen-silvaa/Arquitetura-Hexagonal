package com.arquitetura.hexagonal.adapters.out;

import com.arquitetura.hexagonal.Application.ports.out.DeleteCustomerByIdOutputPort;
import com.arquitetura.hexagonal.adapters.out.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);

    }

}

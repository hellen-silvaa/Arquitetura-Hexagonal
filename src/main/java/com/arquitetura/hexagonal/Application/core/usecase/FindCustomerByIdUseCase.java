package com.arquitetura.hexagonal.Application.core.usecase;

import com.arquitetura.hexagonal.Application.core.domain.Customer;
import com.arquitetura.hexagonal.Application.core.exceptions.ObjectNotFoundException;
import com.arquitetura.hexagonal.Application.ports.in.FindCustomerByIdInputPort;
import com.arquitetura.hexagonal.Application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id){
        return findCustomerByIdOutputPort.find(id)
                .orElseThrow(()-> new ObjectNotFoundException("Customer not found"));
    }
}

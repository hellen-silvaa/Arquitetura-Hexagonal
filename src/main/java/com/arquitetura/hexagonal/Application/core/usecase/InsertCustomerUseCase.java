package com.arquitetura.hexagonal.Application.core.usecase;

import com.arquitetura.hexagonal.Application.core.domain.Customer;
import com.arquitetura.hexagonal.Application.ports.out.FindAddressByZipCodeOutputPort;
import com.arquitetura.hexagonal.Application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(
            InsertCustomerOutputPort insertCustomerOutputPort,
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort
    ){
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    public void insert(Customer customer, String zipCode){
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAnddress(address);
        insertCustomerOutputPort.insert(customer);
    }
}

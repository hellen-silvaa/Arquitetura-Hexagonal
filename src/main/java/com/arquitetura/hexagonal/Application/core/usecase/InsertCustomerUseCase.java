package com.arquitetura.hexagonal.Application.core.usecase;

import com.arquitetura.hexagonal.Application.core.domain.Customer;
import com.arquitetura.hexagonal.Application.ports.in.InsertCustomerINputPort;
import com.arquitetura.hexagonal.Application.ports.out.FindAddressByZipCodeOutputPort;
import com.arquitetura.hexagonal.Application.ports.out.InsertCustomerOutputPort;
import com.arquitetura.hexagonal.Application.ports.out.SendCpfForValidationOutputPort;

public class InsertCustomerUseCase implements InsertCustomerINputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    private final SendCpfForValidationOutputPort sendCpfForValidationOutputPort;

    public InsertCustomerUseCase(
            InsertCustomerOutputPort insertCustomerOutputPort,
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            SendCpfForValidationOutputPort sendCpfForValidationOutputPort
    ){
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
        this.sendCpfForValidationOutputPort = sendCpfForValidationOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode){
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAnddress(address);
        insertCustomerOutputPort.insert(customer);
        sendCpfForValidationOutputPort.send(customer.getCpf());
    }
}

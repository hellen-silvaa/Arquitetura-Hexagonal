package com.arquitetura.hexagonal.adapters.out;

import com.arquitetura.hexagonal.Application.core.domain.Address;
import com.arquitetura.hexagonal.Application.ports.out.FindAddressByZipCodeOutputPort;
import com.arquitetura.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.arquitetura.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}

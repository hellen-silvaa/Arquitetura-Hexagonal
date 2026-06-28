package com.arquitetura.hexagonal.Application.ports.out;
import com.arquitetura.hexagonal.Application.core.domain.Address;


public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}

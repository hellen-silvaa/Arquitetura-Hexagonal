package com.arquitetura.hexagonal.adapters.out.client.mapper;

import com.arquitetura.hexagonal.Application.core.domain.Address;
import com.arquitetura.hexagonal.adapters.out.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}

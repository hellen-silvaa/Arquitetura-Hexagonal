package com.arquitetura.hexagonal.Application.ports.out;

public interface SendCpfForValidationOutputPort {
    void send(String cpf);
}

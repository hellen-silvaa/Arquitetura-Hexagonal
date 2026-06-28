package com.arquitetura.hexagonal.adapters.in.consumer;

import com.arquitetura.hexagonal.Application.ports.in.UpdateCustomerInputPort;
import com.arquitetura.hexagonal.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.arquitetura.hexagonal.adapters.in.consumer.message.CustomerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "arquitetura.hexagonal")
    public void receive(CustomerMessage customerMessage) {
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());


    }
}

package com.arquitetura.hexagonal.Application.core.domain;

public class Customer {

    public Customer() {
        this.isValidCpf = false;
    }

    public Customer(String id, Boolean isValidCpf, String cpf, Address anddress, String name) {
        this.id = id;
        this.isValidCpf = isValidCpf;
        this.cpf = cpf;
        this.anddress = anddress;
        this.name = name;
    }

    private String id;
    private String name;
    private Address anddress;
    private String cpf;
    private Boolean isValidCpf;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAnddress() {
        return anddress;
    }

    public void setAnddress(Address anddress) {
        this.anddress = anddress;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getValidCpf() {
        return isValidCpf;
    }

    public void setValidCpf(Boolean validCpf) {
        isValidCpf = validCpf;
    }
}

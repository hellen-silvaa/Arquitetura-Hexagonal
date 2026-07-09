package com.arquitetura.hexagonal.Application.core.exceptions;

public class ObjectNotFoundException extends RuntimeException {

    public ObjectNotFoundException(final String id) {
        super(String.format("Object with id '%s' not found", id));
    }
}

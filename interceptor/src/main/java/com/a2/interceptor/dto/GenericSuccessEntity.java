package com.a2.interceptor.dto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


public class GenericSuccessEntity<T> extends ResponseEntity<GenericSuccessResponse<T>> {
    final public String message;

    public GenericSuccessEntity(T data, String message) {
        super(new GenericSuccessResponse<>(data, message), HttpStatus.OK);
        this.message = message;
    }


}
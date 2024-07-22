package com.a2.interceptor.dto;


import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

abstract public class GenericResponse<T> extends ResponseEntity<T> {
    public GenericResponse(HttpStatusCode status) {
        super(status);
    }
}





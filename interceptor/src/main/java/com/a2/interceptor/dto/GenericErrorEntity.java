package com.a2.interceptor.dto;


import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;


public class GenericErrorEntity extends ResponseEntity<GenericErrorResponse> {

    public GenericErrorEntity(String error, HttpStatusCode status) {
        super(new GenericErrorResponse(error), status);
    }
}

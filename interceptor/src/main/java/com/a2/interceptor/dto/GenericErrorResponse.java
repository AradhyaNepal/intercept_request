package com.a2.interceptor.dto;


import org.springframework.http.HttpStatusCode;


public class GenericErrorResponse extends GenericResponse<String> {
    final public String error;

    public GenericErrorResponse(String error, HttpStatusCode status) {
        super(status);
        this.error=error;
    }
}

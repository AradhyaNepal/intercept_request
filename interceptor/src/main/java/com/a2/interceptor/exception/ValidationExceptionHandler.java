package com.a2.interceptor.exception;


import com.a2.interceptor.dto.GenericErrorEntity;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ValidationExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public GenericErrorEntity notValid(MethodArgumentNotValidException ex, HttpServletRequest request) {
        StringBuilder error = new StringBuilder();
        for (var e : ex.getAllErrors()) {
            error.append("\n").append(e.getDefaultMessage());
        }
        return new GenericErrorEntity(error.toString(), HttpStatus.BAD_REQUEST);
    }
}

package com.a2.interceptor.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GenericSuccessResponse<T> {
    private T data;
    private String message;

}

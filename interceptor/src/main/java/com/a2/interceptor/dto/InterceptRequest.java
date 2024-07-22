package com.a2.interceptor.dto;


import com.a2.interceptor.constants.ValidationConstants;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterceptRequest {
    @NotEmpty(message = ValidationConstants.interceptorRequestEmpty)
    private String requestCurl;
    @NotEmpty(message = ValidationConstants.interceptorResponseEmpty)
    private String response;
    @NotEmpty(message = ValidationConstants.interceptorStatusCodeEmpty)
    private String statusCode;

    @NotEmpty(message = ValidationConstants.interceptorDeviceIdEmpty)
    private String deviceId;

    @NotEmpty(message = ValidationConstants.interceptorDeviceNameEmpty)
    private String deviceName;

    @NotEmpty(message = ValidationConstants.interceptorProductCodeEmpty)
    private String productCode;

}

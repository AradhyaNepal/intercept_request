package com.a2.interceptor.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InterceptAdminResponse {
    private int id;

    @NotNull
    private String requestCurl;

    @NotNull
    private String response;

    @NotNull
    private String statusCode;

    @NotNull
    private LocalDateTime createdAt;

    @NotNull
    private LocalDateTime lastUpdatedAt;

    @NotNull
    private String deviceId;

    @NotNull
    private String deviceName;

    @NotNull
    private String productCode;
}
package com.a2.interceptor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Entity
@Data
@Table(name = "Intercept")
public class Intercept {
    @Id
    @GeneratedValue
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
    private  String deviceId;

    @NotNull
    private  String deviceName;

    @NotNull
    private String productCode;


}

package com.a2.interceptor.mapper;

import com.a2.interceptor.dto.InterceptAdminResponse;
import com.a2.interceptor.dto.InterceptRequest;
import com.a2.interceptor.entity.Intercept;

import java.time.LocalDateTime;

public class InterceptRequestMapper {

    public static Intercept toEntity(InterceptRequest interceptRequest) {
        LocalDateTime now = LocalDateTime.now();

        return Intercept.builder()
                .requestCurl(interceptRequest.getRequestCurl())
                .response(interceptRequest.getResponse())
                .statusCode(interceptRequest.getStatusCode())
                .createdAt(now)
                .lastUpdatedAt(now)
                .deviceId(interceptRequest.getDeviceId())
                .deviceName(interceptRequest.getDeviceName())
                .productCode(interceptRequest.getProductCode())
                .build();
    }

    public static InterceptAdminResponse toAdminResponse(Intercept intercept) {
        return InterceptAdminResponse.builder()
                .id(intercept.getId())
                .requestCurl(intercept.getRequestCurl())
                .response(intercept.getResponse())
                .statusCode(intercept.getStatusCode())
                .createdAt(intercept.getCreatedAt())
                .lastUpdatedAt(intercept.getLastUpdatedAt())
                .deviceId(intercept.getDeviceId())
                .deviceName(intercept.getDeviceName())
                .productCode(intercept.getProductCode())
                .build();
    }
}
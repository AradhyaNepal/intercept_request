package com.a2.interceptor.controller;

import com.a2.interceptor.constants.SuccessConstants;
import com.a2.interceptor.dto.GenericSuccessResponse;
import com.a2.interceptor.dto.InterceptAdminResponse;
import com.a2.interceptor.dto.InterceptRequest;
import com.a2.interceptor.dto.InterceptMobileResponse;
import com.a2.interceptor.service.InterceptService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/intercept")


@RequiredArgsConstructor
public class InterceptorController {

    final private InterceptService service;

    @PostMapping()
    public GenericSuccessResponse<InterceptMobileResponse> addRequest(@RequestBody @Valid InterceptRequest request) {
        return new GenericSuccessResponse<>(service.addMobile(request), SuccessConstants.interceptRequestCreatedSuccess);
    }

    @GetMapping()
    public GenericSuccessResponse<InterceptAdminResponse> getById(@PathVariable("id") String id) {
        return new GenericSuccessResponse<>(service.getById(id), SuccessConstants.interceptRequestFetchSuccess);
    }
}

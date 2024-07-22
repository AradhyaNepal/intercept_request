package com.a2.interceptor.controller;

import com.a2.interceptor.constants.SuccessConstants;
import com.a2.interceptor.dto.GenericSuccessResponse;
import com.a2.interceptor.dto.InterceptAdminResponse;
import com.a2.interceptor.dto.InterceptRequest;
import com.a2.interceptor.dto.InterceptMobileResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/intercept")


public class InterceptorController {

    @PostMapping()
    GenericSuccessResponse<InterceptMobileResponse> addRequest(@RequestBody @Valid InterceptRequest request) {
        return new GenericSuccessResponse<>(new InterceptMobileResponse(), SuccessConstants.interceptRequestCreatedSuccess);
    }

    @GetMapping()
    GenericSuccessResponse<InterceptAdminResponse> getById(@PathVariable("id") String id) {
        return new GenericSuccessResponse<>(new InterceptAdminResponse(), SuccessConstants.interceptRequestFetchSuccess);
    }
}

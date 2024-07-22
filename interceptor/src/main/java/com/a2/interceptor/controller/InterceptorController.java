package com.a2.interceptor.controller;

import com.a2.interceptor.constants.SuccessConstants;
import com.a2.interceptor.dto.GenericErrorResponse;
import com.a2.interceptor.dto.GenericSuccessResponse;
import com.a2.interceptor.dto.InterceptRequest;
import com.a2.interceptor.dto.InterceptResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/intercept")


public class InterceptorController {

    @PostMapping()
    GenericSuccessResponse<InterceptResponse> addRequest(@RequestBody @Valid InterceptRequest request) {
        return new GenericSuccessResponse<>(new InterceptResponse(), SuccessConstants.interceptRequestSuccess);
    }

    @GetMapping()
    GenericSuccessResponse<>
}

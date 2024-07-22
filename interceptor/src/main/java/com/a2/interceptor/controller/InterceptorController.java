package com.a2.interceptor.controller;

import com.a2.interceptor.constants.SuccessConstants;
import com.a2.interceptor.dto.GenericSuccessEntity;
import com.a2.interceptor.dto.InterceptAdminResponse;
import com.a2.interceptor.dto.InterceptRequest;
import com.a2.interceptor.dto.InterceptMobileResponse;
import com.a2.interceptor.service.InterceptService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/api/v1/intercept")
@RestController
@RequiredArgsConstructor
public class InterceptorController {

    final private InterceptService service;

    @PostMapping(value="/t")
    public GenericSuccessEntity<InterceptMobileResponse> addRequest(@RequestBody @Valid InterceptRequest request) {
        return new GenericSuccessEntity<>(service.addMobile(request), SuccessConstants.interceptRequestFetchSuccess);
    }

    @GetMapping(value="/ t/{id}")
    public GenericSuccessEntity<InterceptAdminResponse> getById(@PathVariable("id") String id) {
        int interceptId;
        try {
            interceptId = Integer.parseInt(id);
            return new GenericSuccessEntity<>(service.getById(interceptId), SuccessConstants.interceptRequestFetchSuccess);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid ID format");
        }
    }
}

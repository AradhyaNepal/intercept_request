package com.a2.interceptor.service;

import com.a2.interceptor.dto.InterceptAdminResponse;
import com.a2.interceptor.dto.InterceptMobileResponse;
import com.a2.interceptor.dto.InterceptRequest;
import org.springframework.stereotype.Service;

@Service
public class InterceptService {

    public InterceptMobileResponse addMobile(InterceptRequest request){
        return  new InterceptMobileResponse();
    }

    public InterceptAdminResponse getById(String id){
        return  new InterceptAdminResponse();
    }
}

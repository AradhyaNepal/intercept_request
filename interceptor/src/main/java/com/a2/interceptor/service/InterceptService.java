package com.a2.interceptor.service;

import com.a2.interceptor.dto.InterceptAdminResponse;
import com.a2.interceptor.dto.InterceptMobileResponse;
import com.a2.interceptor.dto.InterceptRequest;
import com.a2.interceptor.exception.CustomException;
import com.a2.interceptor.mapper.InterceptRequestMapper;
import com.a2.interceptor.repository.InterceptRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InterceptService {

    private final InterceptRepository repository;

    public InterceptMobileResponse addMobile(InterceptRequest request) {
        var data = repository.save(InterceptRequestMapper.toEntity(request));
        return new InterceptMobileResponse(data.getId());

    }

    public InterceptAdminResponse getById(int id) {
        var data = repository.findById(id);
        if (data.isEmpty()) {
            throw new CustomException("Invalid id");
        } else {
            return InterceptRequestMapper.toAdminResponse(data.get());
        }
    }
}

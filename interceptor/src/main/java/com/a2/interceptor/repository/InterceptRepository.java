package com.a2.interceptor.repository;

import com.a2.interceptor.entity.Intercept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InterceptRepository extends JpaRepository<Intercept, Integer> {
}

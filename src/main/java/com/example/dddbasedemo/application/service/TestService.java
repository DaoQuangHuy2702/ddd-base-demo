package com.example.dddbasedemo.application.service;

import com.example.dddbasedemo.application.dto.TestRequest;
import com.example.dddbasedemo.domain.model.TestModel;
import org.springframework.stereotype.Service;

@Service
public interface TestService {
    TestModel getTestById(Integer id);

    void addTest(TestRequest request);

    void updateTest(Integer id, TestRequest request);

    void deleteTest(Integer id);
}

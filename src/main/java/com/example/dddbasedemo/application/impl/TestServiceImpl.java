package com.example.dddbasedemo.application.impl;

import com.example.dddbasedemo.application.dto.TestRequest;
import com.example.dddbasedemo.application.service.TestService;
import com.example.dddbasedemo.domain.model.TestModel;
import com.example.dddbasedemo.domain.repository.TestRepository;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    private final TestRepository repository;

    public TestServiceImpl(TestRepository repository) {
        this.repository = repository;
    }

    @Override
    public TestModel getTestById(Integer id) {
        TestModel model = repository.findById(id).orElse(null);

        return model;
    }

    @Override
    public void addTest(TestRequest request) {
        TestModel model = new TestModel();

        model.setName(request.getName());

        repository.save(model);
    }

    @Override
    public void updateTest(Integer id, TestRequest request) {
        TestModel model = repository.findById(id).orElse(null);

        if (model == null) {
            return;
        }

        model.setName(request.getName());

        repository.save(model);
    }

    @Override
    public void deleteTest(Integer id) {
        repository.delete(id);
    }
}

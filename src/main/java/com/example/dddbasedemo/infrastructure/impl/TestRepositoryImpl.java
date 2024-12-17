package com.example.dddbasedemo.infrastructure.impl;

import com.example.dddbasedemo.domain.model.TestModel;
import com.example.dddbasedemo.domain.repository.TestRepository;
import com.example.dddbasedemo.infrastructure.repository.SpringDataTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class TestRepositoryImpl implements TestRepository {
    @Autowired
    SpringDataTestRepository springDataTestRepository;

    @Override
    public Optional<TestModel> findById(Integer id) {
        return springDataTestRepository.findById(id);
    }

    @Override
    public void save(TestModel model) {
        springDataTestRepository.save(model);
    }

    @Override
    public void delete(Integer id) {
        springDataTestRepository.deleteById(id);
    }
}

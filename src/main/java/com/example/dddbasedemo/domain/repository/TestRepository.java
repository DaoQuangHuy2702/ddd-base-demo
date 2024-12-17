package com.example.dddbasedemo.domain.repository;

import com.example.dddbasedemo.domain.model.TestModel;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TestRepository {
    Optional<TestModel> findById(Integer id);

    void save(TestModel model);

    void delete(Integer id);
}

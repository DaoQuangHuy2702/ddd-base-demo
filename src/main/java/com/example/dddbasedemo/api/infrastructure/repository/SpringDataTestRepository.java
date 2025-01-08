package com.example.dddbasedemo.api.infrastructure.repository;

import com.example.dddbasedemo.api.domain.model.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataTestRepository extends JpaRepository<TestModel, Integer> {
}

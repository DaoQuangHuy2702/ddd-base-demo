package com.example.dddbasedemo.infrastructure.repository;

import com.example.dddbasedemo.domain.model.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataTestRepository extends JpaRepository<TestModel, Integer> {
}

package com.example.dddbasedemo.api.application.service;

import com.example.dddbasedemo.api.domain.exception.BusinessException;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log4j2
public abstract class BaseService<T> {

    private final JpaRepository<T, Long> repository;

    protected BaseService(JpaRepository<T, Long> repository) {
        this.repository = repository;
    }

    public List<T> findAll() {
        return repository.findAll();
    }

    public T findById(Long id) {
        return repository.findById(id).orElseThrow(
                () -> new BusinessException("Could not find entity with id: " + id)
        );
    }

    @Transactional
    public T save(T entity) {
        return repository.save(entity);
    }

    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Transactional
    public void deleteAll() {
        repository.deleteAll();
    }

    public boolean existsById(Long id) {
        return repository.existsById(id);
    }
}
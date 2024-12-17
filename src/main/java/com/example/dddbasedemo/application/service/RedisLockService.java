package com.example.dddbasedemo.application.service;

import org.springframework.stereotype.Service;

@Service
public interface RedisLockService {
    void executeWithLock(String lockKey);
}

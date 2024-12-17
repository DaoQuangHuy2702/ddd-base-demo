package com.example.dddbasedemo.application.impl;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class RedisLockServiceImpl {
    @Autowired
    RedissonClient redissonClient;

    public void executeWithLock(String lockKey) {
        RLock lock = redissonClient.getLock(lockKey);
        boolean isLocked = false;

        try {
            isLocked = lock.tryLock(5, 10, TimeUnit.SECONDS);

            if (isLocked) {
                System.out.println("Lock acquired! Executing critical section...");
            } else {
                System.out.println("Could not acquire lock.");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Failed to acquire lock", e);
        } finally {
            if (isLocked) {
                lock.unlock();
                System.out.println("Lock released.");
            }
        }
    }
}

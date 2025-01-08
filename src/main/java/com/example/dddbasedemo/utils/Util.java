package com.example.dddbasedemo.utils;

import lombok.experimental.UtilityClass;

import java.util.UUID;

@UtilityClass
public class Util {
    public boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }

    public String generateUUID() {
        return UUID.randomUUID().toString();
    }
}

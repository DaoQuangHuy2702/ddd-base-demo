package com.example.dddbasedemo.interfaces.restful;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface TestApi {
    @GetMapping("/hello")
    ResponseEntity<String> hello();
}

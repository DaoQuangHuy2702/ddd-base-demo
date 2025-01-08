package com.example.dddbasedemo.api.interfaces.restful;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface TestApi {
    @GetMapping("/hello")
    ResponseEntity<String> hello();
}

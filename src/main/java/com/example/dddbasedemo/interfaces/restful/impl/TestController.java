package com.example.dddbasedemo.interfaces.restful.impl;

import com.example.dddbasedemo.interfaces.restful.TestApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController implements TestApi {
    @Override
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World");
    }
}

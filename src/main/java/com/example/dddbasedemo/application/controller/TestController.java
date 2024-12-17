package com.example.dddbasedemo.application.controller;

import com.example.dddbasedemo.application.dto.TestRequest;
import com.example.dddbasedemo.application.service.TestService;
import com.example.dddbasedemo.domain.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/{id}")
    TestModel getTestById(@PathVariable Integer id) {
        return testService.getTestById(id);
    }

    @PostMapping()
    void addTest(TestRequest request) {
        testService.addTest(request);
    }

    @PutMapping("/{id}")
    void updateTest(@PathVariable Integer id, TestRequest request) {
        testService.updateTest(id, request);
    }

    @DeleteMapping("/{id}")
    void deleteTest(@PathVariable Integer id) {
        testService.deleteTest(id);
    }
}

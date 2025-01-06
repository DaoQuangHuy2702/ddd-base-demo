package com.example.dddbasedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DddBaseDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DddBaseDemoApplication.class, args);
    }

}

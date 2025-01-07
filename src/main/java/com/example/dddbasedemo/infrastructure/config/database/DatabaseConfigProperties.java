package com.example.dddbasedemo.infrastructure.config.database;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "database")
public class DatabaseConfigProperties {
    private String username;
    private String password;
    private String jdbcUrl;
}

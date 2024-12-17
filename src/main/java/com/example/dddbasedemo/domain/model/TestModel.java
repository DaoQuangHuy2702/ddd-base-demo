package com.example.dddbasedemo.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "test")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT(11)")
    private Integer id;

    @Column(name = "name", columnDefinition = "VARCHAR(50)")
    private String name;
}

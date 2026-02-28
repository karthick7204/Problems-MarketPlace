package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;

@Document(collection="problems")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Problems {
    @Id
    private String id;
    private String title;
    private String description;
    
}

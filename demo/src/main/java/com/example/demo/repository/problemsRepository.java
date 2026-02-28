package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Problems;

public interface ProblemsRepository extends MongoRepository<Problems, String> {
    
}

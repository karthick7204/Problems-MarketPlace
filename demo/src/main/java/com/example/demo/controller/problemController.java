package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.problemsRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.problems;


@RestController
public class problemController {
    
    @Autowired
    private problemsRepository repo;

    @PostMapping("/problems")
    public problems createProblems(@RequestBody problems problem) {
        return repo.save(problem);
    }
    
}

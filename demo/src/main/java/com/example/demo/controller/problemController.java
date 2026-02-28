package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.ProblemsRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.Problems;


@RestController
public class problemController {
    
    @Autowired
    private ProblemsRepository repo;

    @PostMapping("/problems")
    public Problems createProblems(@RequestBody Problems problem) {
        return repo.save(problem);
    }
}

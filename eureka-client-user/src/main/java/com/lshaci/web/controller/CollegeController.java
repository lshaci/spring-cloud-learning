package com.lshaci.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("college")
public class CollegeController {

    @GetMapping("getAll")
    public Object getAllCollege() {
        System.err.println("===========>8082");
        return "所有学院";
    }
}

package com.eaglequeiroz.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/poc")
public class PocController {

    @GetMapping
    public String getPocSample(){
        return "Just a simple test for this sample (and simple) API";
    }
}

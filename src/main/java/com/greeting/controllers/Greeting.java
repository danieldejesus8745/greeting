package com.greeting.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/greeting")
public class Greeting {

    @GetMapping
    public String greeting() {
        return "Hello World!";
    }

}

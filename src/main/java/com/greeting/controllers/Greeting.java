package com.greeting.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping(path = "api/v1/greeting")
public class Greeting {

    @GetMapping
    public String greeting() {
        return "NEW HELLO";
    }

}

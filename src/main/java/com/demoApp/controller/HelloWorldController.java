package com.demoApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String getHello() {
        return "Hello World!";
    }

    @GetMapping("/message")
    public String getMessage() {
        return "Message from the server!";
    }
}

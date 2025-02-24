package com.example.SpringGreetingApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @GetMapping
    public String getGreeting(){
        return "{message : Hello, Get request received!}";
    }

    @PostMapping
    public String postGreeting(){
        return "{message : Hello , POST request received!}";
    }

    @PutMapping
    public String putGreeting(){
        return "{message : Hello , PUT request received! }";
    }

    @DeleteMapping
    public String deleteGreeting(){
        return "{message : Hello , DELETE request received!}";
    }
    
}

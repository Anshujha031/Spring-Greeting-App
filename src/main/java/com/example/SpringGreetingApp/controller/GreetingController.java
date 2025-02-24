package com.example.SpringGreetingApp.controller;

import com.example.SpringGreetingApp.service.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetingController {


    private final GreetingService greetingService;


    public GreetingController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    @GetMapping
    public String getGreeting(){
        return greetingService.getGreetingService();
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

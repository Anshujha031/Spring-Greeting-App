package com.example.SpringGreetingApp.controller;

import com.example.SpringGreetingApp.model.Greeting;
import com.example.SpringGreetingApp.service.GreetingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/greet")
public class GreetingController {


    private final GreetingService greetingService;


    public GreetingController(GreetingService greetingService){
        this.greetingService = greetingService;
    }


    @GetMapping("/service")
    public String getGreeting(){
        return greetingService.getGreetingService();
    }

    // UC3: Personalized Greeting (New Endpoint)
    @GetMapping("/personalized")
    public String  getPersonalizedGreeting(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {
        return (greetingService.getPersonalizedGreeting(firstName, lastName));
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


    @PostMapping("/save")
    public Greeting saveGreeting(@RequestParam String message){
        return greetingService.saveGreeting(message);
    }


}
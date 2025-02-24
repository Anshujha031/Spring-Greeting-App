package com.example.SpringGreetingApp.service;

import com.example.SpringGreetingApp.model.Greeting;
import com.example.SpringGreetingApp.repository.GreetingRepository;
import com.fasterxml.jackson.databind.type.ClassStack;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository){
        this.greetingRepository = greetingRepository;
    }

    //save greeting to database
    public Greeting saveGreeting(String message){
        Greeting greeting = new Greeting(message);
        return greetingRepository.save(greeting);
    }

    public List<Greeting> getAllGreeting(){
        return greetingRepository.findAll();
    }



    public String getGreetingService(){
        return "{message : Hello, World!}";
    }

    public String getPersonalizedGreeting (String firstName, String lastName) {
        String message;

        if (firstName != null && lastName != null) {
            message = "Hello, " + firstName + " " + lastName + "!";
        } else if (firstName != null) {
            message = "Hello, " + firstName + "!";
        } else if (lastName != null) {
            message = "Hello, " + lastName + "!";
        } else {
            message = "Hello, World!";
        }

        return message;
    }


}

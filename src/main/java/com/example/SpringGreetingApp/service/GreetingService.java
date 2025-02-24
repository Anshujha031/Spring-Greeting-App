package com.example.SpringGreetingApp.service;

import com.example.SpringGreetingApp.model.Greeting;
import com.example.SpringGreetingApp.repository.GreetingRepository;
import com.fasterxml.jackson.databind.type.ClassStack;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

    //find by id
    public Greeting getGreetingById(Long id){
        return greetingRepository.findById(id).orElse(null);
    }

    // Get all Greetings
    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }

    public Greeting updateGreeting(Long id, String newMessage) {
        Optional<Greeting> optionalGreeting = greetingRepository.findById(id);

        if (optionalGreeting.isPresent()) {
            Greeting greeting = optionalGreeting.get();
            greeting.setMessage(newMessage);
            return greetingRepository.save(greeting); // Save and return the updated greeting
        } else {
            throw new RuntimeException("Greeting not found with ID: " + id);
        }
    }

}

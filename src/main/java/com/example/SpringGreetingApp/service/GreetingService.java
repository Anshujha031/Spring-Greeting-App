package com.example.SpringGreetingApp.service;

import com.fasterxml.jackson.databind.type.ClassStack;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GreetingService {
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

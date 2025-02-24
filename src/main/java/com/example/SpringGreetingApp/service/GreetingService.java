package com.example.SpringGreetingApp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreetingService(){
        return "{message : Hello, World!}";
    }
}

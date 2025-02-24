package com.example.SpringGreetingApp.model;


import jakarta.persistence.*;

@Entity
@Table(name = "greetings")
public class Greeting {

    @Id  // ✅ This makes 'id' the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // ✅ Auto-generate the ID
    private Long id;

    private String message;

    // ✅ Default constructor (required by JPA)
    public Greeting() {
    }

    // ✅ Constructor
    public Greeting(String message) {
        this.message = message;
    }

    // ✅ Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
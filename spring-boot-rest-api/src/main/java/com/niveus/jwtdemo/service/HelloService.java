package com.niveus.jwtdemo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    private String defaultGreeting = "Hello!";

    public HelloService() {
        super();
    }

    public String getHelloGreeting() {
        return defaultGreeting;
    }

    public String getHelloGreeting(String name) {
        return String.format("%s, %s", defaultGreeting, name);
    }
}

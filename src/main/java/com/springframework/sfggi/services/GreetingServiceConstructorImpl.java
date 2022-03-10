package com.springframework.sfggi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceConstructorImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello constructor injected ";
    }
}

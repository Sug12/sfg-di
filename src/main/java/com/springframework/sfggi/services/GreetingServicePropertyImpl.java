package com.springframework.sfggi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicePropertyImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello property injected";
    }
}

package com.springframework.sfggi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary // use this service in case when Greeting service is required but what exact implementation is required is not known
@Service
public class GreetingServicePrimaryImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Primary injected";
    }
}

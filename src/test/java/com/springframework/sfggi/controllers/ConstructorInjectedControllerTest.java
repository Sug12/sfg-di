package com.springframework.sfggi.controllers;

import com.springframework.sfggi.services.GreetingServiceConstructorImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceConstructorImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}
package com.springframework.sfggi.controllers;

import com.springframework.sfggi.services.GreetingServiceConstructorImpl;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    void setUp(){
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceConstructorImpl();
    }

    @Test
    void getGreeting(){
        System.out.println(controller.greetingService.sayGreeting());
    }

}
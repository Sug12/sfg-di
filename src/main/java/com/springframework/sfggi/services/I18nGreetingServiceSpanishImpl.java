package com.springframework.sfggi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18nGreetingServiceSpanishImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello in ES";
    }
}

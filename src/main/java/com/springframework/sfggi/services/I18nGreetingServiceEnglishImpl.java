package com.springframework.sfggi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nGreetingServiceEnglishImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello in EN";
    }
}

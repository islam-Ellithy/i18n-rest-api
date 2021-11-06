package com.lamaatech.testservice.services;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nServicea")
@Profile("EN")
public class i18nEnglishServiceImpl implements I18nService{
    @Override
    public String sayHello() {
        return "hello - En";
    }
}

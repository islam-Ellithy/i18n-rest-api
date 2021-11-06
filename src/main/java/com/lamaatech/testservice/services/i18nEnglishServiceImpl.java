package com.lamaatech.testservice.services;


import org.springframework.stereotype.Service;

@Service("i18nService")
public class i18nEnglishServiceImpl implements I18nService{
    @Override
    public String sayHello() {
        return "hello - En";
    }
}

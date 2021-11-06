package com.lamaatech.testservice.controllers;

import com.lamaatech.testservice.services.I18nService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class I18nController implements I18nIController{
    private final I18nService service;

    public I18nController(I18nService serviceImpl){
        service = serviceImpl;
    }

    @Override
    public String sayHello() {
        return service.sayHello();
    }


}

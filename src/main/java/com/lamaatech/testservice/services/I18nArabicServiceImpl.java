package com.lamaatech.testservice.services;

import org.springframework.stereotype.Service;

@Service("i18nService")
public class I18nArabicServiceImpl implements I18nService {
    @Override
    public String sayHello() {
        return "مرحبا- Ar";
    }
}

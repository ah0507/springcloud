package com.chensee.service;

import org.springframework.stereotype.Component;

@Component
public class FeignHystric implements FeignService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}

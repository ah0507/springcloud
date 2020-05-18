package com.chensee.controller;

import com.chensee.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private FeignService feignService;

    @GetMapping(value = "/feignHi")
    public String sayHi(@RequestParam String name) {
        return feignService.sayHiFromClientOne( name );
    }
}

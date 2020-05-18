package com.chensee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BaseController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/zkInfo")
    public String home(){
        return "hi i'm zipkin!";
    }

    @RequestMapping("/zipkin")
    public String info(){
        return restTemplate.getForObject("http://localhost:8764/srInfo",String.class);
    }

}

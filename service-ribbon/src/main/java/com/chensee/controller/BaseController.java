package com.chensee.controller;

import com.chensee.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BaseController {

    @Autowired
    BaseService baseService;
    @Autowired
    private RestTemplate restTemplate;


    @GetMapping(value = "/ribbonHi")
    public String hi(@RequestParam String name) {
        return baseService.hiService( name );
    }

    @RequestMapping("/serviceRibbon")
    public String info(){
        return restTemplate.getForObject("http://localhost:8772/zkInfo",String.class);
    }

    @RequestMapping("/srInfo")
    public String srInfo(){
        return "service-ribbon";
    }

}

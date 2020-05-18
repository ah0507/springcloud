package chensee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BaseController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/zkInfo1")
    public String info(){
        return restTemplate.getForObject("http://localhost:8772/zkInfo",String.class);
    }

    @RequestMapping("/zkInfo1")
    public String srInfo(){
        return "zikpin-ribbon1";
    }

}

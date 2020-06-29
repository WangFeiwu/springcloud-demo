package com.study.consumerdemo.controller;

import com.study.consumerdemo.service.HelloDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author wfw
 * @Date 2020/06/18 16:43
 */
@RestController
public class CustomerController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HelloDemoService helloDemoService;

    @GetMapping("index")
    public String index() {
        return restTemplate.getForObject("http://helloserver/", String.class);
    }

    @GetMapping("index2")
    public String index2() {
        return helloDemoService.index();
    }
}

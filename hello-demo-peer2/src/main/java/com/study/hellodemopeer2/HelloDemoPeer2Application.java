package com.study.hellodemopeer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class HelloDemoPeer2Application {

    public static void main(String[] args) {
        SpringApplication.run(HelloDemoPeer2Application.class, args);
    }

    @GetMapping("")
    public String index() {
        return "这是服务端2返回的应答";
    }
}

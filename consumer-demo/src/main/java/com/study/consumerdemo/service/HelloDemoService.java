package com.study.consumerdemo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author wfw
 * @Date 2020/06/19 08:37
 */
@Component
@FeignClient(name = "helloserver")
public interface HelloDemoService {
    @GetMapping("")
    String index();
}

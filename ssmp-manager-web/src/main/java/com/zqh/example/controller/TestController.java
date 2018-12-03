package com.zqh.example.controller;

import com.zqh.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService testService;
    @RequestMapping("/test")
    public String test(){
        return testService.now();
    }
}

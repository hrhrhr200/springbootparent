package com.huang.example.controller;

import com.huang.example.sevices.HelloServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloServices helloServices;

    @GetMapping("/home")
    public String hi(String name) {
        return helloServices.hiService(name);
    }
}

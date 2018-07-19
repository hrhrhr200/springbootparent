package com.huang.example.controller;

import com.huang.example.services.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping("/home")
    public String hi(String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}

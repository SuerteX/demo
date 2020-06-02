package com.example.demo.controller;

import com.example.demo.service.DemoInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoInter demoInter;

    @RequestMapping("/demo")
    public Integer getAge(){
        return demoInter.getAgeFromName("Amy");
    }
}

package com.springboot.learn.concept.basic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// This will connect to the browser and print Hi, Hello Sathya!! with the port no: 8080
@RestController
public class Hello {

    @RequestMapping("/")
    public String welcome(){
        return "Hi, Hello Sathya!!";
    }
}

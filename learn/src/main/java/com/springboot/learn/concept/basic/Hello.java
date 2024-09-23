package com.springboot.learn.concept.basic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// This will connect to the browser and print Hi, Hello Sathya!! with the port no: 8080
// @RestController - handles http request and generate responses for restful web services.This is the sepecialized version of the @controller and @ResponseBody
@RestController
public class Hello {

    @RequestMapping("/")
    public String welcome(){
        return "Hi, Hello Sathya!!";
    }

    @RequestMapping("/login")
    public String login(){
        return "Welcome to the login page.. Please login..";
    }
}

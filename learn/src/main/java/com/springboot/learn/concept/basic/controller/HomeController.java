package com.springboot.learn.concept.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//spring can handle multiple controller at the same time - which all handled by front controller as a hidden layer
@Controller
public class HomeController {

    @ResponseBody
    @RequestMapping("/cart")
    public String Cart(){
        return "Your cart is empty";
    }
}

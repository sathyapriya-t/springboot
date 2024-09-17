package com.springboot.learn.concept.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Developer {
    public void buildApp(){
        System.out.println("Building an Applications");
    }
}
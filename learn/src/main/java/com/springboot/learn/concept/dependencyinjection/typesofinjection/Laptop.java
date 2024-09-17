package com.springboot.learn.concept.dependencyinjection.typesofinjection;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    public void logIn() {
        System.out.println("Logged in via Laptop");
    }
}
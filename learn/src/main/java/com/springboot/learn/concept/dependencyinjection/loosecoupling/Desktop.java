package com.springboot.learn.concept.dependencyinjection.loosecoupling;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Asset {

    @Override
    public void logIn() {
        System.out.println("Logged in via Desktop");
    }
}
package com.springboot.learn.concept.dependencyinjection.loosecoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tester {

    //Now we have two classes which implements - now spring boot will be confused which object to inject either Tablet or Desktop
    //So here we can use the @Primary annotation - which basically tells if you have any confusion take the class which is mentioned as primary
    @Autowired
    Asset asset;

    public void buildApp() {
        asset.logIn();
        System.out.println("Building an Applications");
    }
}
package com.springboot.learn.concept.dependencyinjection.loosecoupling;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary - For Dependency injection, if we have 2 or more class which implements the same Interface.
// That Interface is used for dependency injection as instance variable, then spring boot will be confused.
// So in that time we need to add this annotation.
@Primary
@Component
public class Tablet implements Asset {

    @Override
    public void logIn() {
        System.out.println("Logged in via Tablet");
    }
}

package com.springboot.learn.concept.dependencyinjection.typesofinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component - creates the object of that class - so before getting the bean make sure its created or-else we will get error as No Qualifying bean of type
@Component
public class Developer {

    //Using @Component -bean is created. To connect/wire that bean inside this class we use @Autowired
    //@Autowired- will inject the created bean which is created using @Component in Laptop Class

    //Field Injection - no that much good - need to use autowired or-else will throw No qualifying bean of type error
    //Laptop laptop; - Instance variable - automatically assigns as null if we didn't initialize - that's why we have to add autowired to inject the bean

    @Autowired
    Laptop laptop;

    /*Constructor Injection - better (No need to use autowired)
    Laptop laptop;
    public Developer(Laptop laptop){
        this.laptop = laptop;
    }*/

    /*Setter Injection - better - need to use autowired or-else will throw No qualifying bean of type error
    private Laptop laptop;
    @Autowired
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }*/

    public void buildApp() {
        laptop.logIn();
        System.out.println("Building an Applications");
    }
}
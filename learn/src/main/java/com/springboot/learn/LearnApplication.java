package com.springboot.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnApplication {

    public static void main(String[] args) {
       /*
        //SpringApplication.run(LearnApplication.class, args) -> This basically creates a container(Spring IOC) and returns it which is of type ApplicationContext.
        //Inside the IOC container - spring creates an object
        //Using the container we can get objects
        //@Component - creates the object of that class - so before getting the bean make sure its created or-else we will get error as No Qualifying bean of type
        ApplicationContext context = SpringApplication.run(LearnApplication.class, args);

        //context - container
        //contextBean - object
        Developer contextBean = context.getBean(Developer.class);
        Tester testerContextBean = context.getBean(Tester.class);

        //Using Object we can call the method
        contextBean.buildApp();
        testerContextBean.buildApp();
        */
        SpringApplication.run(LearnApplication.class, args);


    }

}

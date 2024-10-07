package com.springboot.learn.concept.jpa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Resource not Found")
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(){
        super("Resource not Found");
    }
}

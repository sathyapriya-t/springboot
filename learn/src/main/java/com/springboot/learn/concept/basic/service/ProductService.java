package com.springboot.learn.concept.basic.service;

import com.springboot.learn.concept.basic.data.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    List<Product> products = List.of(new Product(101,"IPhone", 5000)
            ,new Product(102,"WaterBottle", 50)
            ,new Product(103,"Mug", 20));

    public List<Product> getProducts(){
        return products;
    }
}

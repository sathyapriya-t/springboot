package com.springboot.learn.concept.jpa.controller;

import com.springboot.learn.concept.jpa.data.Product;
import com.springboot.learn.concept.jpa.service.JPAProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("jpa")
public class JPAController {

    @Autowired
    JPAProductService JPAProductService;

    //RequestMapping also works the same as getMapping
   /* @RequestMapping("/products")
    public List<Product> getProducts(){
        return JPAProductService.getProducts();
    }*/

    //@RequestHeader - It binds the Request Header with method parameter. Using this we can access the header of the Http request
    @GetMapping("/products")
    public Iterable<Product> getProducts(@RequestHeader(HttpHeaders.CONTENT_LENGTH) String val) {
        System.out.println(val);
        return JPAProductService.getProducts();
    }

    //@PathVariable - Extracts values from the URI path.Used when the value is part of the URL path itself, often for identifying resources.
    //localhost:8080/products/101
    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable Long prodId) {
        return JPAProductService.getProductById(prodId);
    }

    //@RequestParam - Extracts query parameters from the query string of the HTTP request.Typically used for optional parameters or when you want to pass data in the URL in a key-value format.
    //localhost:8080/product?prodId=101
    //RequestHeader - it binds the request header to method parameter and can access it.
    @GetMapping("/product")
    public Product getProductByIdUsingRequestParam(@RequestHeader Map<String,String> header, @RequestParam Long prodId) {
        //header.forEach((key1, value) -> System.out.println(key1 + " " + value));
        return JPAProductService.getProductById(prodId);
    }

    @PostMapping("/product")
    public void saveProductById(Product product) {
        JPAProductService.saveProduct(product);
    }

    @PostMapping("/products")
    public void saveProducts(@RequestBody List<Product> products) {
        JPAProductService.saveProducts(products);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product) {
        JPAProductService.saveProduct(product);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProductById(@PathVariable Long prodId) {
        JPAProductService.deleteProduct(prodId);
    }

    @DeleteMapping("/products")
    public void deleteProduct() {
        JPAProductService.deleteProducts();
    }
}

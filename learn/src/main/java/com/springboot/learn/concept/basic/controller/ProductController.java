package com.springboot.learn.concept.basic.controller;

import com.springboot.learn.concept.basic.data.Product;
import com.springboot.learn.concept.basic.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    //RequestMapping also works the same as getMapping
   /* @RequestMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }*/
    @GetMapping("/products")
    public Map<Integer, Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return productService.getProductById(prodId);
    }

    @PostMapping("/product")
    public void saveProductById(@RequestBody Product product) {
        productService.saveProduct(product);
    }

    @PostMapping("/products")
    public void saveProducts(@RequestBody List<Product> products) {
        productService.saveProducts(products);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product) {
        productService.saveProduct(product);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProductById(@PathVariable int prodId) {
        productService.deleteProduct(prodId);
    }

    @DeleteMapping("/products")
    public void deleteProduct() {
        productService.deleteProducts();
    }
}

package com.springboot.learn.concept.jpa.service;

import com.springboot.learn.concept.jpa.data.Product;
import com.springboot.learn.concept.jpa.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JPAProductService {

    @Autowired
    private ProductRepository repository;
    public Iterable<Product> getProducts() {
        return repository.findAll();

    }

    public Product getProductById(Long prodId) {
        return repository.findById(prodId).orElse(null);
    }

    public void saveProduct(Product product) {
        repository.save(product);
    }

    public void deleteProduct(Long prodId) {
        if (getProductById(prodId) != null) {
            repository.deleteById(prodId);
        }
    }

    public void saveProducts(List<Product> productList) {
        repository.saveAll(productList);

    }
    public void deleteProducts() {
        repository.deleteAll();
    }


}

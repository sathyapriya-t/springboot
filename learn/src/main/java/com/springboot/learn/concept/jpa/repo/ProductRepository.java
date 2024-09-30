package com.springboot.learn.concept.jpa.repo;

import com.springboot.learn.concept.jpa.data.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}

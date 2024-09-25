package com.springboot.learn.concept.basic.service;

import com.springboot.learn.concept.basic.data.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {
    private final Map<Integer, Product> productMap = new HashMap<>();

    public Map<Integer, Product> getProducts() {
        return productMap;
    }

    public Product getProductById(int prodId) {
        return productMap.getOrDefault(prodId, null);
    }

    public void saveProduct(Product product) {
        productMap.put(product.getProdId(), product);
    }

    public void deleteProduct(int prodId) {
        if (getProductById(prodId) != null) {
            productMap.remove(prodId);
        }
    }

    public void saveProducts(List<Product> productList) {
        productList.forEach(product -> productMap.put(product.getProdId(), product));

    }
    public void deleteProducts() {
        productMap.clear();
    }


}

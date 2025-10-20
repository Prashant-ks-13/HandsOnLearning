package com.jpalearning.ecommerce.service;

import com.jpalearning.ecommerce.entity.Product;

import java.util.List;

public interface ProductService {
    Product addProduct (Product product);
    List<Product> getAll ();
    Product updateProduct(Long id);
    void deleteAll();
    void deleteById(Long id);
}

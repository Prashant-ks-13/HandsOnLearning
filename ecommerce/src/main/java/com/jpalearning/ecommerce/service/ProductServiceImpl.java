package com.jpalearning.ecommerce.service;

import com.jpalearning.ecommerce.entity.Product;
import com.jpalearning.ecommerce.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService{


   private final  ProductRepository productRepository;


    @Override
    public Product addProduct(Product product) {
        productRepository.save(product);
        return  product;
    }

    @Override
    public List<Product> getAll() {
        List<Product> res = productRepository.findAll();
        return res;
    }

    @Override
    public Product updateProduct(Long id) {
        Optional<Product> product = productRepository.findById(id.intValue());
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Long id) {

    }
}

package com.example.thymeleafdemo.services;

import com.example.thymeleafdemo.domain.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}

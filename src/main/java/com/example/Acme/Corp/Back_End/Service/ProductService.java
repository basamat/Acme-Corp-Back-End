package com.example.Acme.Corp.Back_End.Service;

import com.example.Acme.Corp.Back_End.Entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts(String category);
    Product getProductById(Long id);
    Product createProduct(Product product);
}

package com.example.Acme.Corp.Back_End.Repository;

import com.example.Acme.Corp.Back_End.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository <Product, Long> {
    List<Product> findByCategory(String category);
}

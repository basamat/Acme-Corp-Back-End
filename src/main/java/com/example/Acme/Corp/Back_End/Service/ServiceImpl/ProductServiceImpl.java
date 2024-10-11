package com.example.Acme.Corp.Back_End.Service.ServiceImpl;

import com.example.Acme.Corp.Back_End.Entity.Product;
import com.example.Acme.Corp.Back_End.Repository.ProductRepository;
import com.example.Acme.Corp.Back_End.Service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getProducts(String category) {
        if (category != null) {
            return productRepository.findByCategory(category);
        }
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}

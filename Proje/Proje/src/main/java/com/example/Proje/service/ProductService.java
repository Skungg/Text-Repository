package com.example.Proje.service;

import com.example.Proje.dto.ProductDto;
import com.example.Proje.entity.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);

    List<Product> getProduct();

    void delete(Long Id);

    ProductDto update(ProductDto productDto);

    Product getById(Long productId);
}

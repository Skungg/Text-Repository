package com.example.Proje.service.impl;

import com.example.Proje.config.ProductDtoMapper;
import com.example.Proje.dto.ProductDto;
import com.example.Proje.entity.Product;
import com.example.Proje.repository.ProductRepository;
import com.example.Proje.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ProductDtoMapper productDtoMapper;

    public ProductImpl(ProductRepository productRepository, ProductDtoMapper productDtoMapper) {
        this.productRepository = productRepository;
        this.productDtoMapper = productDtoMapper;
    }
    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
    @Override
    public List<Product> getProduct() {
        List<Product> products = productRepository.findAll();
        return products;
    }
    @Override
    public void delete(Long Id) {
        productRepository.deleteById(Id);
    }
    @Override
    public Product getById(Long productId){
        return  productRepository.findById(productId).get();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ProductDto update(ProductDto productDto) {
        Product product1 = productRepository.findById(productDto.getId()).get();
        productDtoMapper.partialUpdate(product1, productDto);
        return productDtoMapper.toDto(productRepository.save(product1));
    }
}

package com.example.Proje.service.impl;

import com.example.Proje.config.OrderDtoMapper;
import com.example.Proje.config.ProductDtoMapper;
import com.example.Proje.dto.OrderDto;
import com.example.Proje.entity.Order;
import com.example.Proje.entity.Product;
import com.example.Proje.repository.OrderRepository;
import com.example.Proje.repository.ProductRepository;
import com.example.Proje.service.OrderService;
import com.example.Proje.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Service
public class OrderImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final OrderDtoMapper orderDtoMapper;
    private final ProductRepository productRepository;
    private final ProductService productService;
    private final ProductDtoMapper productDtoMapper;

    public OrderImpl(OrderRepository orderRepository, OrderDtoMapper orderDtoMapper, ProductRepository productRepository, ProductService productService, ProductDtoMapper productDtoMapper) {
        this.orderRepository = orderRepository;
        this.orderDtoMapper = orderDtoMapper;
        this.productRepository = productRepository;
        this.productService = productService;
        this.productDtoMapper = productDtoMapper;
    }

    @Override
    public Order save(Order order) throws Exception {

        Order newOrder = null;
        var aBoolean = productRepository.checkUnit(order.getProduct().getId());
        if (aBoolean>0) {
            newOrder = orderRepository.save(order);
            Product product = productService.getById(order.getProduct().getId());
            int result = (int) (product.getUnit() - order.getOrderQuantity());
            product.setUnit(result);
            productService.update(productDtoMapper.toDto(product));
        }else {
            throw new Exception("Ürün yok");
        }
        return newOrder;
    }

    @Override
    public List<Order> getOrder() {
        List<Order> orders = orderRepository.findAll();
        return orders;
    }

    @Override
    public void delete(Long Id) {
        orderRepository.deleteById(Id);
    }

    @Override
    public OrderDto update(OrderDto orderDto, Long id) {
        Order order1 = orderRepository.findById(id).get();
        orderDtoMapper.partialUpdate(order1, orderDto);
        return orderDtoMapper.toDto(orderRepository.save(order1));
    }
}

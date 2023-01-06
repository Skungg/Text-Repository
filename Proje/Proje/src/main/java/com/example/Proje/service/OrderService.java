package com.example.Proje.service;

import com.example.Proje.dto.OrderDto;
import com.example.Proje.entity.Order;

import java.util.List;

public interface OrderService {
    Order save(Order order) throws Exception;

    List<Order> getOrder();

    void delete(Long Id);

    OrderDto update(OrderDto orderDto, Long id);
}

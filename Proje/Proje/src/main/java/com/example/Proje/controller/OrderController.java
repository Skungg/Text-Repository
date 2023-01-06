package com.example.Proje.controller;

import com.example.Proje.dto.OrderDto;
import com.example.Proje.entity.Order;
import com.example.Proje.repository.OrderRepository;
import com.example.Proje.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "order")
public class OrderController {
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public OrderController(OrderService orderService, OrderRepository orderRepository) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }
    @PostMapping("/createOrder")
    public Order save(@RequestBody Order order) throws Exception {
        return orderService.save(order);
    }
    @GetMapping("/getOrder")
    public List<Order> getOrder(){
        return orderService.getOrder();

    }
    @DeleteMapping("/deleteOrder/{id}")
    public void delete(@PathVariable("id") Long id){
        orderService.delete(id);
    }
    @PatchMapping("/patchOrder/{id}")
    public ResponseEntity<OrderDto> updateOrder(@RequestBody OrderDto orderDto, @PathVariable("id") Long id){
        if (id == orderDto.getId()){
            return ResponseEntity.ok(orderService.update(orderDto, id));
        }
        else{
            throw new IllegalArgumentException("ID'LER EŞLEŞMİYOR");
        }
    }
}

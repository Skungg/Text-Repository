package com.example.Proje.config;

import com.example.Proje.dto.OrderDto;
import com.example.Proje.entity.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderDtoMapper extends EntityMapper<OrderDto, Order>{

}

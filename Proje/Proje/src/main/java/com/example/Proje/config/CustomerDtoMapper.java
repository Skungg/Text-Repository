package com.example.Proje.config;

import com.example.Proje.dto.CustomerDto;
import com.example.Proje.entity.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerDtoMapper extends EntityMapper<CustomerDto, Customer>{

}

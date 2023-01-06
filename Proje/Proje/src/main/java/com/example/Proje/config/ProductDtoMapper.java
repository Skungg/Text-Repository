package com.example.Proje.config;

import com.example.Proje.dto.ProductDto;
import com.example.Proje.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductDtoMapper extends EntityMapper<ProductDto, Product>{

}

package com.example.Proje.config;

import com.example.Proje.dto.AddressDto;
import com.example.Proje.entity.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressDtoMapper extends EntityMapper<AddressDto, Address>{

}

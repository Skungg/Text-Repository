package com.example.Proje.config;

import com.example.Proje.dto.CityDto;
import com.example.Proje.entity.City;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CityDtoMapper extends EntityMapper<CityDto, City>{

}

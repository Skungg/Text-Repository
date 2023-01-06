package com.example.Proje.config;

import com.example.Proje.dto.DistrictDto;
import com.example.Proje.entity.District;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DistrictDtoMapper extends EntityMapper<DistrictDto, District>{

}

package com.example.deneme2.config;

import com.example.deneme2.dto.CreateDto;
import com.example.deneme2.dto.UserDto;
import com.example.deneme2.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CreateUserMapper extends EntityMapper<CreateDto, User>{

}

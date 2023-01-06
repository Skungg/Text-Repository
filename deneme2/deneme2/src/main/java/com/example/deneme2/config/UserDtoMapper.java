package com.example.deneme2.config;

import com.example.deneme2.dto.GetUserDto;
import com.example.deneme2.dto.UserDto;
import com.example.deneme2.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDtoMapper extends EntityMapper<UserDto, User>{

}

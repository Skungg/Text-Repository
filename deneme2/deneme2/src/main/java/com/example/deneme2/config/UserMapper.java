package com.example.deneme2.config;

import com.example.deneme2.dto.CreateDto;
import com.example.deneme2.dto.GetUserDto;
import com.example.deneme2.dto.UserDto;
import com.example.deneme2.entity.User;
import org.mapstruct.*;

import java.lang.annotation.Target;

@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<GetUserDto, User>{

}

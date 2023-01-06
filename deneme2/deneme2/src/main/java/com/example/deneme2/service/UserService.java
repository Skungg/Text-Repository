package com.example.deneme2.service;

import com.example.deneme2.dto.CreateDto;
import com.example.deneme2.dto.GetUserDto;
import com.example.deneme2.dto.UserDto;
import com.example.deneme2.entity.User;

import java.util.List;
public interface UserService {
    User save(User user);
    CreateDto postSaveDto(CreateDto createDto);
    List<User> getUser();
    List<GetUserDto> getUserDto();
    User getFirstName(String firstName);
    List<GetUserDto> getUserDtoFirstName(String firstName);
    void deleteId(Long Id);
    UserDto save(UserDto userDto, Long id);
}

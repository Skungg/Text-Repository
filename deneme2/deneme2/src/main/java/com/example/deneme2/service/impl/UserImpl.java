package com.example.deneme2.service.impl;

import com.example.deneme2.config.*;
import com.example.deneme2.dto.CreateDto;
import com.example.deneme2.dto.GetUserDto;
import com.example.deneme2.dto.UserDto;
import com.example.deneme2.entity.User;
import com.example.deneme2.repository.UserRepository;
import com.example.deneme2.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;


//İŞ KURALLARI
@Service
public class UserImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final CreateUserMapper createUserMapper;
    private final GetUserMapper getUserMapper;
    private final UserDtoMapper userDtoMapper;

    public UserImpl(UserRepository userRepository, UserMapper userMapper, CreateUserMapper createUserMapper, GetUserMapper getUserMapper, UserDtoMapper userDtoMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.createUserMapper = createUserMapper;
        this.getUserMapper = getUserMapper;
        this.userDtoMapper = userDtoMapper;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public CreateDto postSaveDto(CreateDto createDto) {
        User user = createUserMapper.toEntity(createDto);
        user = userRepository.save(user);
        return createUserMapper.toDto(user);
    }

    @Override
    public List<User> getUser() {
        List<User> users = userRepository.findAll();
        return users;
    }

    @Override
    public List<GetUserDto> getUserDto() {
        return getUserMapper.toDto(userRepository.findAll());
    }

    @Override
    public User getFirstName(String firstName) {
        User users = userRepository.findUserByFirstName(firstName);
        return users;
    }

    @Override
    public List<GetUserDto> getUserDtoFirstName(String firstName) {
        return getUserMapper.toDto(userRepository.findUsersByFirstName(firstName));
    }

    @Override
    public void deleteId(Long Id) {
        userRepository.deleteById(Id);
    }

    @Override
    public UserDto save(UserDto userDto, Long id) {
        User user1 = userRepository.findById(id).get();
        userDtoMapper.partialUpdate(user1, userDto);
        return userDtoMapper.toDto(userRepository.save(user1));
    }




}

//get veri getirmek
//post kayıt etmek
//patch güncelleme
//delete silme
//http Request method araştır
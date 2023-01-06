package com.example.deneme2.controller;

import com.example.deneme2.config.UserMapper;
import com.example.deneme2.dto.CreateDto;
import com.example.deneme2.dto.GetUserDto;
import com.example.deneme2.dto.UserDto;
import com.example.deneme2.entity.User;
import com.example.deneme2.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @PostMapping("/createUser")
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @PostMapping("/createUsers")
    public CreateDto postSaveDto(@RequestBody CreateDto createDto){
        return userService.postSaveDto(createDto);
    }

    @GetMapping("/users")
    public List<User> getUser(){
        return userService.getUser();
    }

    @GetMapping("/usersDto")
    public List<GetUserDto> getUserDto(){
        return userService.getUserDto();
    }

    @GetMapping("/user/{firstName}")
    public ResponseEntity<User>getFirstName(@PathVariable("firstName") String firstName){
        return ResponseEntity.ok(userService.getFirstName(firstName));
    }

    @GetMapping("/userDto/{firstNameWithDto}")
    public ResponseEntity<List<GetUserDto>>getUserDtoFirstName(@PathVariable("firstNameWithDto") String firstName){
        return ResponseEntity.ok(userService.getUserDtoFirstName(firstName));
    }

    @DeleteMapping("/userDelete/{id}")
    public void deleteId(@PathVariable("id")Long id){
        userService.deleteId(id);
    }

    @PatchMapping("/user/{id}")
    public ResponseEntity<UserDto> patchUser(@RequestBody UserDto userDto, @PathVariable("id")Long id) {
        if (id == userDto.getId()) {
            return ResponseEntity.ok(userService.save(userDto, id));
        } else {
            throw new IllegalArgumentException("ID'LER EŞLEŞMİYOR");
        }
    }
}

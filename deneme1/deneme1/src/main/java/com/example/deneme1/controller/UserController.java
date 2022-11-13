package com.example.deneme1.controller;

import com.example.deneme1.entity.User;
import com.example.deneme1.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;



@RestController
@RequestMapping(value = "user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/createUser")
    public User save(@RequestBody User user){
        return userService.save(user);
    }
    @GetMapping("/users")
    public List<User> getUser(){
        return userService.getUser();
    }

    @GetMapping("/user/{firstname}")
    public User getFirstName(@PathVariable("firstname") String firstName){
        return userService.getFirstName(firstName);
    }
    @DeleteMapping("/userDelete/{id}")
    public void deleteId(@PathVariable("id")Long id){
        userService.deleteId(id);
    }
    @PatchMapping("/user/{id}")
    public ResponseEntity<User> patchUser(@RequestBody User user, @PathVariable("id")Long id){
        if(id == user.getId()){
            return ResponseEntity.ok(userService.save(user, id));
        }
        else{
            throw new IllegalArgumentException("ID'LER EŞLEŞMİYOR");
        }

    }
}

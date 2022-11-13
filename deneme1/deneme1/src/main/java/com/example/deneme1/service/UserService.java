package com.example.deneme1.service;

import com.example.deneme1.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;
public interface UserService {
    User save(User user);

    List<User> getUser();

    User getFirstName(String firstName);

    void deleteId(Long Id);

    User save(User user, Long id);
}

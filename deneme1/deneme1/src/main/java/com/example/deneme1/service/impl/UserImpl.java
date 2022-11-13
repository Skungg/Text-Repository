package com.example.deneme1.service.impl;

import com.example.deneme1.entity.User;
import com.example.deneme1.repository.UserRepository;
import com.example.deneme1.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


//İŞ KURALLARI
@Service
public class UserImpl implements UserService {
    private final UserRepository userRepository;

    public UserImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUser() {
        List<User> users=userRepository.findAll();
        return users;
    }

    @Override
    public User getFirstName(String firstName) {
        return userRepository.findUserByFirstName(firstName);
    }

    @Override
    public void deleteId(Long Id) {
        userRepository.deleteById(Id);
    }

    @Override
    public User save(User user, Long id) {
        User user1 = userRepository.findById(id).get();
        user1.setId(user.getId());
        if(user.getFirstName()!=null){
            user1.setFirstName(user.getFirstName());
        }
        if(user.getLastName()!=null){
            user1.setLastName(user.getLastName());
        }
        return userRepository.save(user1);
    }
}

//get veri getirmek
//post kayıt etmek
//patch güncelleme
//delete silme
//http Request method araştır
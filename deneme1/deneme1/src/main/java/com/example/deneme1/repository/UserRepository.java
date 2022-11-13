package com.example.deneme1.repository;

import com.example.deneme1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

//Database işlemleri
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select u from User u where u.firstName =:firstName")
    User findUserByFirstName(@Param("firstName") String firstName);
}

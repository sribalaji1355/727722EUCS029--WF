package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springapp.model.Balaji727722EUCS029User;
import java.util.List;


@Repository
public interface Balaji727722EUCS029UserRepo extends JpaRepository<Balaji727722EUCS029User, Integer> {
    @Query(value = "SELECT u FROM User u WHERE u.userId = ?1")
    Balaji727722EUCS029User findByUserId(int userId);

    @Query(value = "SELECT u FROM User u WHERE u.userName=?1")
    Balaji727722EUCS029User findByUserName(String userName);
}

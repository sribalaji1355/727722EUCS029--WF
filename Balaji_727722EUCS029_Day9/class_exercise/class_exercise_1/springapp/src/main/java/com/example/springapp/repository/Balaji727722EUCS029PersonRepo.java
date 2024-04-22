package com.example.springapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springapp.model.Balaji727722EUCS029Person;

public interface Balaji727722EUCS029PersonRepo extends JpaRepository<Balaji727722EUCS029Person, Integer> {
    @Query("SELECT p FROM Person p WHERE age=?1")
    List<Balaji727722EUCS029Person> findByAge(int age);
}

package com.examly.class_exercise_1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.class_exercise_1.model.Balaji727722EUCS029Person;

/**
 * PersonRepo
 */
@Repository
public interface Balaji727722EUCS029PersonRepo extends JpaRepository<Balaji727722EUCS029Person, Integer> {

     List<Balaji727722EUCS029Person> findByAge(int byAge);
}
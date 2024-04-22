package com.examly.class_exercise_2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.class_exercise_2.model.Balaji727722EUCS029Course;

@Repository
public interface Balaji727722EUCS029CourseRepo extends JpaRepository<Balaji727722EUCS029Course, Integer> {

     List<Balaji727722EUCS029Course> findByCourseName(String courseName);

}
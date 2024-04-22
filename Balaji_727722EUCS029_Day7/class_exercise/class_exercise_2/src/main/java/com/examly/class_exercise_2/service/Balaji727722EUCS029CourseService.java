package com.examly.class_exercise_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_2.model.Balaji727722EUCS029Course;
import com.examly.class_exercise_2.repository.Balaji727722EUCS029CourseRepo;

@Service
public class Balaji727722EUCS029CourseService {

     @Autowired
     public Balaji727722EUCS029CourseRepo courseRepo;

     public Balaji727722EUCS029Course SaveEntity(Balaji727722EUCS029Course entity) {
          return courseRepo.save(entity);

     }

     public List<Balaji727722EUCS029Course> getDetails() {
          return courseRepo.findAll();

     }

     public List<Balaji727722EUCS029Course> findByCourseName(String courseName) {
          return courseRepo.findByCourseName(courseName);
     }

}

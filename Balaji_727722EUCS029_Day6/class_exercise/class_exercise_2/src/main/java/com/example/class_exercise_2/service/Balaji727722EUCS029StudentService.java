package com.example.class_exercise_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.class_exercise_2.model.Balaji727722EUCS029Student;
import com.example.class_exercise_2.repository.Balaji727722EUCS029StudentRepo;

@Service
public class Balaji727722EUCS029StudentService {

     @Autowired
     public Balaji727722EUCS029StudentRepo studentRepo;

     public List<Balaji727722EUCS029Student> getAll() {
          return studentRepo.findAll();
     }

     public Balaji727722EUCS029Student post(Balaji727722EUCS029Student student) {
          return studentRepo.save(student);
     }

     public List<Balaji727722EUCS029Student> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}

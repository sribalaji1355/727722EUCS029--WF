package com.examly.class_exercise_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_1.model.Balaji727722EUCS029Person;
import com.examly.class_exercise_1.repository.Balaji727722EUCS029PersonRepo;

@Service
public class Balaji727722EUCS029PersonService {

     @Autowired
     public Balaji727722EUCS029PersonRepo personRepo;

     public Balaji727722EUCS029Person SaveEntity(Balaji727722EUCS029Person entity) {
          return personRepo.save(entity);

     }

     public List<Balaji727722EUCS029Person> getDetails() {
          return personRepo.findAll();

     }

     public List<Balaji727722EUCS029Person> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}

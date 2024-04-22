package com.examly.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_2.model.Balaji727722EUCS029Course;
import com.examly.class_exercise_2.service.Balaji727722EUCS029CourseService;

@RestController
public class Balaji727722EUCS029CourseController {

     @Autowired
     public Balaji727722EUCS029CourseService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<Balaji727722EUCS029Course> postMethodName(@RequestBody Balaji727722EUCS029Course entity) {

          Balaji727722EUCS029Course inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<Balaji727722EUCS029Course>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<Balaji727722EUCS029Course>> getMethodName() {

          List<Balaji727722EUCS029Course> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<Balaji727722EUCS029Course>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<Balaji727722EUCS029Course>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<Balaji727722EUCS029Course> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}
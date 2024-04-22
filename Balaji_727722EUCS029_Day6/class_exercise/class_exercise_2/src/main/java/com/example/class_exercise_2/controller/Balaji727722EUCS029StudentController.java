package com.example.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_2.model.Balaji727722EUCS029Student;
import com.example.class_exercise_2.service.Balaji727722EUCS029StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Balaji727722EUCS029StudentController {

     @Autowired
     public Balaji727722EUCS029StudentService studentService;

     @GetMapping("/api/student")
     public ResponseEntity<List<Balaji727722EUCS029Student>> getDetails() {
          List<Balaji727722EUCS029Student> list = studentService.getAll();
          if (list.isEmpty()) {
               return new ResponseEntity<List<Balaji727722EUCS029Student>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<Balaji727722EUCS029Student>>(list, HttpStatus.OK);

     }

     @PostMapping("/api/student")
     public ResponseEntity<Balaji727722EUCS029Student> postMethodName(@RequestBody Balaji727722EUCS029Student student) {

          Balaji727722EUCS029Student postData = studentService.post(student);
          return new ResponseEntity<>(postData, HttpStatus.OK);
     }

     @GetMapping("/api/student/sort/{field}")
     public ResponseEntity<List<Balaji727722EUCS029Student>> sortedDetails(@PathVariable String field) {
          List<Balaji727722EUCS029Student> list = studentService.sortedDetails(field);
          if (list.isEmpty()) {
               return new ResponseEntity<List<Balaji727722EUCS029Student>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<Balaji727722EUCS029Student>>(list, HttpStatus.OK);

     }
}

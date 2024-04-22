package com.examly.class_exercise_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_1.model.Balaji727722EUCS029Person;
import com.examly.class_exercise_1.service.Balaji727722EUCS029PersonService;

@RestController
public class Balaji727722EUCS029PersonController {

     @Autowired
     public Balaji727722EUCS029PersonService personService;

     @PostMapping("/api/person")
     public ResponseEntity<Balaji727722EUCS029Person> postMethodName(@RequestBody Balaji727722EUCS029Person entity) {

          Balaji727722EUCS029Person inst = personService.SaveEntity(entity);

          return new ResponseEntity<Balaji727722EUCS029Person>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<Balaji727722EUCS029Person>> getMethodName() {

          List<Balaji727722EUCS029Person> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<Balaji727722EUCS029Person>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<Balaji727722EUCS029Person>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<Balaji727722EUCS029Person> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}
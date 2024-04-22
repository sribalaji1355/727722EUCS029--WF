package com.example.class_exercise_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
// import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_1.model.Balaji727722EUCS029Children;
import com.example.class_exercise_1.service.Balaji727722EUCS029ChildrenService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Balaji727722EUCS029ChildrenController {

     @Autowired
     public Balaji727722EUCS029ChildrenService childrenService;

     @GetMapping("/api/children/sortBy/{babyFirstName}")
     public ResponseEntity<List<Balaji727722EUCS029Children>> sort(@PathVariable String babyFirstName) {
          List<Balaji727722EUCS029Children> child = childrenService.sort(babyFirstName);

          if (child.isEmpty()) {

               return new ResponseEntity<>(child, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<>(child, HttpStatus.OK);

     }

     // Pagination
     @GetMapping("api/children/{offset}/{pagesize}")
     public ResponseEntity<List<Balaji727722EUCS029Children>> pagination(@PathVariable int offset, @PathVariable int pagesize) {
          List<Balaji727722EUCS029Children> pages = childrenService.pagination(offset, pagesize);
          if (pages.isEmpty()) {
               return new ResponseEntity<List<Balaji727722EUCS029Children>>(pages, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<Balaji727722EUCS029Children>>(pages, HttpStatus.OK);
     }

     @GetMapping("/api/children/{offset}/{pagesize}/{field}")
     public ResponseEntity<List<Balaji727722EUCS029Children>> sortedPage(@PathVariable int offset, @PathVariable int pagesize,
               @PathVariable String field) {
          List<Balaji727722EUCS029Children> sortedPage = childrenService.sortedPage(offset, pagesize, field);
          if (sortedPage.isEmpty()) {

               return new ResponseEntity<>(sortedPage, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<>(sortedPage, HttpStatus.OK);
     }

     @PostMapping("/api/children")
     public ResponseEntity<Balaji727722EUCS029Children> postDetails(@RequestBody Balaji727722EUCS029Children children) {

          return new ResponseEntity<Balaji727722EUCS029Children>(childrenService.save(children), HttpStatus.CREATED);
     }

}
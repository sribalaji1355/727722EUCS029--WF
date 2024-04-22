package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.springapp.model.Balaji727722EUCS029Person;
import com.example.springapp.service.Balaji727722EUCS029PersonService;

@RestController
public class Balaji727722EUCS029PersonController {
    @Autowired
    private Balaji727722EUCS029PersonService ser;

    @PostMapping("/person")
    public ResponseEntity<Balaji727722EUCS029Person> post(@RequestBody Balaji727722EUCS029Person person) {
        if (ser.post(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/person/findByLastnameNot")
    public ResponseEntity<List<Balaji727722EUCS029Person>> getAll(@RequestParam String lastname) {
        List<Balaji727722EUCS029Person> li = ser.start(lastname);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/person/findByAgeNotIn")
    public ResponseEntity<List<Balaji727722EUCS029Person>> getbyAge(@RequestParam List<Integer> ages) {
        List<Balaji727722EUCS029Person> li = ser.end(ages);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

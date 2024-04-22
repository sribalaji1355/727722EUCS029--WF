package com.example.springapp.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Balaji727722EUCS029Person;
import com.example.springapp.service.Balaji727722EUCS029PersonService;

@RestController
public class Balaji727722EUCS029PersonController {
    public Balaji727722EUCS029PersonService personService;

    public Balaji727722EUCS029PersonController(Balaji727722EUCS029PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/api/person")
    public ResponseEntity<Balaji727722EUCS029Person> postMethodName(@RequestBody Balaji727722EUCS029Person person) {
        if (personService.savePerson(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/api/person/byage/{age}")
    public ResponseEntity<List<Balaji727722EUCS029Person>> getMethodName(@PathVariable("age") int age) {
        List<Balaji727722EUCS029Person> list = personService.getPersonByAge(age);
        if (list.size() == 0) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}

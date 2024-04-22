package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.springapp.model.Balaji727722EUCS029Village;
import com.example.springapp.service.Balaji727722EUCS029VillageService;

@RestController
public class Balaji727722EUCS029VillageController {
    @Autowired
    private Balaji727722EUCS029VillageService ser;

    @PostMapping("/api/village")
    public ResponseEntity<Balaji727722EUCS029Village> post(@RequestBody Balaji727722EUCS029Village person) {
        if (ser.post(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/village/byname/{villageName}")
    public ResponseEntity<Balaji727722EUCS029Village> getAll(@PathVariable String villageName) {
        Balaji727722EUCS029Village li = ser.start(villageName);
        if (li!=null) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/village/bypopulation/{villagePopulation}")
    public ResponseEntity<List<Balaji727722EUCS029Village>> getbyAge(@PathVariable int villagePopulation) {
        List<Balaji727722EUCS029Village> li = ser.end(villagePopulation);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/village/{villageId}")
    public ResponseEntity<Balaji727722EUCS029Village> get3(@PathVariable int villageId) {
        Balaji727722EUCS029Village li = ser.get3(villageId);
        if (li!=null) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}

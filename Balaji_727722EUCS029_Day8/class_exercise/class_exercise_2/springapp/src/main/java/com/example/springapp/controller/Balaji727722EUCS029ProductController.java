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
import com.example.springapp.model.Balaji727722EUCS029Product;
import com.example.springapp.service.Balaji727722EUCS029ProductService;

@RestController
public class Balaji727722EUCS029ProductController {
    @Autowired
    private Balaji727722EUCS029ProductService ser;

    @PostMapping("/product")
    public ResponseEntity<Balaji727722EUCS029Product> post(@RequestBody Balaji727722EUCS029Product person) {
        if (ser.post(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/product/distinct/startwith/{name}")
    public ResponseEntity<List<Balaji727722EUCS029Product>> getAll(@PathVariable("name") String name) {
        List<Balaji727722EUCS029Product> li = ser.start(name);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("product/distict/endswith/{name}")
    public ResponseEntity<List<Balaji727722EUCS029Product>> getbyAge(@PathVariable("name") String name) {
        List<Balaji727722EUCS029Product> li = ser.end(name);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/product/sortBy/price")
    public ResponseEntity<List<Balaji727722EUCS029Product>> getbyge() {
        List<Balaji727722EUCS029Product> li = ser.sort();
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

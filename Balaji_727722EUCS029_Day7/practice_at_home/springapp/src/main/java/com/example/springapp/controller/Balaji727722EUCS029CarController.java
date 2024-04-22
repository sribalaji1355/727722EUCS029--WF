package com.example.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Balaji727722EUCS029Car;
import com.example.springapp.service.Balaji727722EUCS029CarService;

@RestController
public class Balaji727722EUCS029CarController {
    @Autowired
    private Balaji727722EUCS029CarService carService;

    @PostMapping("/api/car")
    public ResponseEntity<Balaji727722EUCS029Car> post(@RequestBody Balaji727722EUCS029Car car) {
        if (carService.post(car)) {
            return new ResponseEntity<>(car, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/car")
    public ResponseEntity<List<Balaji727722EUCS029Car>> getAll() {
        List<Balaji727722EUCS029Car> li = carService.getAll();
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/car/distinct")
    public ResponseEntity<Balaji727722EUCS029Car> getbyDistinct(@RequestParam String currentOwnerName, @RequestParam String address) {
        Balaji727722EUCS029Car car = carService.getByDetails(currentOwnerName, address);
        if (car != null) {
            return new ResponseEntity<>(car, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

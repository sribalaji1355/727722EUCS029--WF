package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Balaji727722eucs029StudentDetail;
import com.example.springapp.service.Balaji727722eucs029StudentDetailService;

@RestController
public class Balaji727722eucs029StudentDetailController {
    @Autowired
    Balaji727722eucs029StudentDetailService studentDetailService;
    
    @PostMapping("/studentDetail/student/{id}")
    public ResponseEntity<Balaji727722eucs029StudentDetail> addStudentDetails(@PathVariable int id,@RequestBody Balaji727722eucs029StudentDetail studentDetail)
    {
       return new ResponseEntity<>(studentDetailService.addStudentDetail(id,studentDetail),HttpStatus.CREATED);
    }
    
}

package com.example.relation.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.model.Balaji727722EUCS029Student;
import com.example.relation.service.Balaji727722eucs029StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class Balaji727722eucs029StudentController {
    public Balaji727722eucs029StudentService studentService;
    public Balaji727722eucs029StudentController(Balaji727722eucs029StudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public Balaji727722EUCS029Student postMethodName(@RequestBody Balaji727722EUCS029Student student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<Balaji727722EUCS029Student> getMethodName() {
        return studentService.getStudents();
    }
    
}

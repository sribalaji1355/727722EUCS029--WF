package com.example.bidirection.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.model.Balaji727722EUCS029Student;
import com.example.bidirection.model.Balaji727722eucs029StudentInfo;
import com.example.bidirection.service.Balaji727722eucs029StudentService;
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
    @PostMapping("/api/poststudent")
    public Balaji727722EUCS029Student postMethodName(@RequestBody Balaji727722EUCS029Student student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public Balaji727722eucs029StudentInfo postMethodName(@RequestBody Balaji727722eucs029StudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<Balaji727722EUCS029Student> getMethodName() {
        return studentService.getStudents();
    }
    
}
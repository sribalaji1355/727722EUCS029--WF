package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Balaji727722eucs029Student;
import com.example.springapp.repository.Balaji727722eucs029StudentRepository;

@Service
public class Balaji727722eucs029StudentService {
    @Autowired
    Balaji727722eucs029StudentRepository studentRepository;
    public Balaji727722eucs029Student addStudents(Balaji727722eucs029Student student)
    {
        return studentRepository.save(student);
    }
    public List<Balaji727722eucs029Student>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<Balaji727722eucs029Student>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<Balaji727722eucs029Student>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}

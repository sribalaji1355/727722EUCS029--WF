package com.example.relation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.model.Balaji727722EUCS029Student;
import com.example.relation.repository.Balaji727722eucs029StudentRepository;

@Service
public class Balaji727722eucs029StudentService {
    public Balaji727722eucs029StudentRepository studentRepository;
    public Balaji727722eucs029StudentService(Balaji727722eucs029StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public Balaji727722EUCS029Student saveStudent(Balaji727722EUCS029Student student)
    {
        return studentRepository.save(student);
    }
    public List<Balaji727722EUCS029Student> getStudents()
    {
        return studentRepository.findAll();
    }
}

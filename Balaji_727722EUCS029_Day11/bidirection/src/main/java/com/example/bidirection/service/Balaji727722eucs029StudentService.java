package com.example.bidirection.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.model.Balaji727722EUCS029Student;
import com.example.bidirection.model.Balaji727722eucs029StudentInfo;
import com.example.bidirection.repository.Balaji727722eucs029StudentInfoRepository;
import com.example.bidirection.repository.Balaji727722eucs029StudentRepository;

@Service
public class Balaji727722eucs029StudentService {
    public Balaji727722eucs029StudentRepository studentRepository;
    public Balaji727722eucs029StudentInfoRepository studentInfoRepository;
    public Balaji727722eucs029StudentService(Balaji727722eucs029StudentRepository studentRepository,Balaji727722eucs029StudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public Balaji727722EUCS029Student saveStudent(Balaji727722EUCS029Student student)
    {
        return studentRepository.save(student);
    }
    public Balaji727722eucs029StudentInfo saveStudentInfo(Balaji727722eucs029StudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<Balaji727722EUCS029Student> getStudents()
    {
        return studentRepository.findAll();
    }
}

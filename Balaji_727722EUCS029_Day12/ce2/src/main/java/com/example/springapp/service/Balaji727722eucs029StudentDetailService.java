package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Balaji727722eucs029StudentDetail;
import com.example.springapp.repository.Balaji727722eucs029StudentDetailRepository;
import com.example.springapp.repository.Balaji727722eucs029StudentRepository;

@Service
public class Balaji727722eucs029StudentDetailService {
    @Autowired
    Balaji727722eucs029StudentDetailRepository studentDetailRepository;
    @Autowired
    Balaji727722eucs029StudentRepository studentRepository;
    public Balaji727722eucs029StudentDetail addStudentDetail(int id,Balaji727722eucs029StudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }
    
    
}

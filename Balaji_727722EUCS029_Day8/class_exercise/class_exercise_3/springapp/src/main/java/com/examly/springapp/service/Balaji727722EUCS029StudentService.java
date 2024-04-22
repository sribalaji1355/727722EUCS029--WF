package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Balaji727722EUCS029Student;
import com.examly.springapp.repository.Balaji727722EUCS029StudentRepo;

@Service
public class Balaji727722EUCS029StudentService {
    @Autowired
    private Balaji727722EUCS029StudentRepo studentRepo;

    public boolean post(Balaji727722EUCS029Student student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Balaji727722EUCS029Student> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<Balaji727722EUCS029Student> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}

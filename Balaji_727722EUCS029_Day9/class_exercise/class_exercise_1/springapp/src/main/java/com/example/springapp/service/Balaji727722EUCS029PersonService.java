package com.example.springapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.model.Balaji727722EUCS029Person;
import com.example.springapp.repository.Balaji727722EUCS029PersonRepo;

@Service
public class Balaji727722EUCS029PersonService {
    public Balaji727722EUCS029PersonRepo personRepo;

    public Balaji727722EUCS029PersonService(Balaji727722EUCS029PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(Balaji727722EUCS029Person person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<Balaji727722EUCS029Person> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}

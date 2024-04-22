package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Balaji727722EUCS029Person;
import com.example.springapp.repository.Balaji727722EUCS029PersonRepo;

@Service
public class Balaji727722EUCS029PersonService {
    @Autowired
    private Balaji727722EUCS029PersonRepo rep;

    public boolean post(Balaji727722EUCS029Person person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<Balaji727722EUCS029Person> start(String lastname)
    {
        return rep.findByLastnameNot(lastname);
    }

    public List<Balaji727722EUCS029Person> end(List<Integer> ages)
    {
        return rep.findByAgeNotIn(ages);
    }
    
}

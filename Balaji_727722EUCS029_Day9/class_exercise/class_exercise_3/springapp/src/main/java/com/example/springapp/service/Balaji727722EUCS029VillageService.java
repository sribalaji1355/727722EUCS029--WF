package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Balaji727722EUCS029Village;
import com.example.springapp.repository.Balaji727722EUCS029VillageRepo;

@Service
public class Balaji727722EUCS029VillageService {
    @Autowired
    private Balaji727722EUCS029VillageRepo rep;

    public boolean post(Balaji727722EUCS029Village person)
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

    public Balaji727722EUCS029Village start(String lastname)
    {
        return rep.findByName(lastname);
    }
    public Balaji727722EUCS029Village get3(int id)
    {
        return rep.findById(id);
    }

    public List<Balaji727722EUCS029Village> end(int population)
    {
        return rep.findByPopulation(population);
    }
    
}

package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Balaji727722EUCS029Product;
import com.example.springapp.repository.Balaji727722EUCS029ProductRepo;

@Service
public class Balaji727722EUCS029ProductService {
    @Autowired
    private Balaji727722EUCS029ProductRepo rep;

    @SuppressWarnings("null")
    public boolean post(Balaji727722EUCS029Product person)
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

    public List<Balaji727722EUCS029Product> start(String value)
    {
        return rep.findByProductNameStartingWith(value);
    }

    public List<Balaji727722EUCS029Product> end(String value)
    {
        return rep.findByProductNameEndingWith(value);
    }
    public List<Balaji727722EUCS029Product> sort()
    {
        return rep.findAll(Sort.by("price"));
    }
    
}

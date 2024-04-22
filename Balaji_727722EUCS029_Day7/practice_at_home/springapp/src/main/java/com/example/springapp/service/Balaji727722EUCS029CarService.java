package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Balaji727722EUCS029Car;
import com.example.springapp.repository.Balaji727722EUCS029CarRepo;

@Service
public class Balaji727722EUCS029CarService {
    @Autowired
    private Balaji727722EUCS029CarRepo carRepo;

    public boolean post(Balaji727722EUCS029Car car)
    {
        try
        {
            carRepo.save(car);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<Balaji727722EUCS029Car> getAll()
    {
        return carRepo.findAll();
    }

    public Balaji727722EUCS029Car getByDetails(String currentOwnerName, String address)
    {
        try{
        return carRepo.findDistinctBycurrentOwnerNameAndAddress(currentOwnerName, address);
        }
        catch(IncorrectResultSizeDataAccessException i)
        {
            System.out.println("\n\n"+i+"\n\nUse List if needed");
            return null;
        }
        catch(Exception e)
        {
            System.out.println("\n\n"+e);
            return null;
        }
    }
    
}

package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Balaji727722EUCS029Door;
import com.example.springapp.repository.Balaji727722EUCS029DoorRepo;

@Service
public class Balaji727722EUCS029DoorService {
    @Autowired
    private Balaji727722EUCS029DoorRepo rep;

    public boolean post(Balaji727722EUCS029Door door)
    {
        try
        {
            rep.save(door);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<Balaji727722EUCS029Door> getAll()
    {
        return rep.findAll();
    }

    public List<Balaji727722EUCS029Door> getbyDoorId(int doorId)
    {
        return rep.findByDoorId(doorId);
    }
    public List<Balaji727722EUCS029Door> getbyType(String type)
    {
        return rep.findByAccessType(type);
    }
    
}

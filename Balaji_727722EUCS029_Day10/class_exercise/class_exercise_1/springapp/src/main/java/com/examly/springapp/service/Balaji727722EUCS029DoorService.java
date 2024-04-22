package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Balaji727722EUCS029Door;
import com.examly.springapp.repository.Balaji727722EUCS029DoorRepo;

@Service
public class Balaji727722EUCS029DoorService {
    @Autowired
    private Balaji727722EUCS029DoorRepo doorRepo;

    public Balaji727722EUCS029Door postData(Balaji727722EUCS029Door door) {
        return doorRepo.save(door);
    }

    public List<Balaji727722EUCS029Door> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public Balaji727722EUCS029Door updateDetail(int doorid, Balaji727722EUCS029Door door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<Balaji727722EUCS029Door> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<Balaji727722EUCS029Door> getAllDetails() {

        return doorRepo.findAll();
    }

    public Balaji727722EUCS029Door getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}
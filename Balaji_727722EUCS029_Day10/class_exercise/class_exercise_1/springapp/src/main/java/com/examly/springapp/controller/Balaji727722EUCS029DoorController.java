package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Balaji727722EUCS029Door;
import com.examly.springapp.service.Balaji727722EUCS029DoorService;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
public class Balaji727722EUCS029DoorController {

    @Autowired
    public Balaji727722EUCS029DoorService doorService;

    @PostMapping("/door")
    public ResponseEntity<Balaji727722EUCS029Door> postData(@RequestBody Balaji727722EUCS029Door door) {
        Balaji727722EUCS029Door doorData = doorService.postData(door);
        if (doorData != null) {
            return new ResponseEntity<>(doorData, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("door/bycolor/{color}")
    public ResponseEntity<List<Balaji727722EUCS029Door>> getBycolor(@PathVariable String color) {
        List<Balaji727722EUCS029Door> door = doorService.getBycolor(color);
        if (door != null) {
            return new ResponseEntity<>(door, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping("door/{doorid}")
    public ResponseEntity<Balaji727722EUCS029Door> updateDetailResponseEntity(@PathVariable int doorid, @RequestBody Balaji727722EUCS029Door door) {
        Balaji727722EUCS029Door doorData = doorService.updateDetail(doorid, door);
        if (doorData != null) {
            return new ResponseEntity<>(doorData, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("door/{doorid}")
    public ResponseEntity<String> deleteDoor(@PathVariable int doorid) {
        if (doorService.deleteDoor(doorid)) {
            return new ResponseEntity<>("Door deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/door/bydoortype/{doortype}")
    public ResponseEntity<List<Balaji727722EUCS029Door>> getByDoor(@PathVariable String doortype) {
        List<Balaji727722EUCS029Door> door = doorService.getByDoorType(doortype);
        if (door != null) {
            return new ResponseEntity<>(door, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/door")
    public ResponseEntity<List<Balaji727722EUCS029Door>> getAllDetails() {
        List<Balaji727722EUCS029Door> door = doorService.getAllDetails();
        if (door != null) {

            return new ResponseEntity<>(door, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/door/{doorid}")
    public ResponseEntity<Balaji727722EUCS029Door> getDetailsById(@PathVariable int doorid) {
        Balaji727722EUCS029Door door = doorService.getDetailsById(doorid);
        if (door != null) {
            return new ResponseEntity<>(door, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
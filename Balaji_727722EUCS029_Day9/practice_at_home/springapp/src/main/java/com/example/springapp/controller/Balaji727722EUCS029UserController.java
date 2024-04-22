package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Balaji727722EUCS029User;
import com.example.springapp.service.Balaji727722EUCS029UserService;

@RestController
@RequestMapping("/api")
public class Balaji727722EUCS029UserController {
    
    @Autowired
    private Balaji727722EUCS029UserService userService;

    @PostMapping("/user")
    public ResponseEntity<Balaji727722EUCS029User> post(@RequestBody Balaji727722EUCS029User user)
    {
        if(userService.postUser(user))
        {
            return new ResponseEntity<Balaji727722EUCS029User>(user, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<Balaji727722EUCS029User> getById(@PathVariable int userId)
    {
        Balaji727722EUCS029User user = userService.getById(userId);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<Balaji727722EUCS029User>(user, HttpStatus.OK);
        }
    }

    @GetMapping("/user/byName/{userName}")
    public ResponseEntity<Balaji727722EUCS029User> getByUserName(@PathVariable String userName)
    {
        Balaji727722EUCS029User user = userService.getByUserName(userName);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<Balaji727722EUCS029User>(user, HttpStatus.OK);
        }
    }
}

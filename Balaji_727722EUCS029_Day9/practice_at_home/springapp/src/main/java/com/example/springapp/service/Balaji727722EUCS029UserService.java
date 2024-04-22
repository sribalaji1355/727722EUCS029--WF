package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Balaji727722EUCS029User;
import com.example.springapp.repository.Balaji727722EUCS029UserRepo;

@Service
public class Balaji727722EUCS029UserService {
   @Autowired
   private Balaji727722EUCS029UserRepo userRepo;
   
   public boolean postUser(Balaji727722EUCS029User user)
   {
        try{
            userRepo.save(user);
            return true;
        }
        catch(Exception e){
            return false;
        }   
   }

   public Balaji727722EUCS029User getById(int userId)
   {
        return userRepo.findByUserId(userId);
   }

   public Balaji727722EUCS029User getByUserName(String userName)
   {
        return userRepo.findByUserName(userName);
   }
}

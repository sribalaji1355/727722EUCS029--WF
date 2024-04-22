package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.springapp.model.Balaji727722EUCS029Recipe;
import com.example.springapp.service.Balaji727722EUCS029RecipeService;

@RestController
public class Balaji727722EUCS029RecipeController {
    @Autowired
    private Balaji727722EUCS029RecipeService ser;

    @PostMapping("/api/recipe")
    public ResponseEntity<Balaji727722EUCS029Recipe> post(@RequestBody Balaji727722EUCS029Recipe person) {
        if (ser.post(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/recipe/byname")
    public ResponseEntity<List<Balaji727722EUCS029Recipe>> getAllbyFiltering(@RequestParam("recipeName") String recipeName) {
        List<Balaji727722EUCS029Recipe> li = ser.filter(recipeName);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/recipe/{recipeId}")
    public ResponseEntity<Balaji727722EUCS029Recipe> getbyrecipeId(@PathVariable("recipeId") int recipeId) {
        Balaji727722EUCS029Recipe li = ser.getByid(recipeId);
        if (li!=null) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}

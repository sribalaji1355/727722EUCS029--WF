package com.example.q1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.q1.model.Balaji727722eucs029Book;
import com.example.q1.service.Balaji727722eucs029BookService;

@RestController
public class Balaji727722eucs029BookController {
    @Autowired
    private Balaji727722eucs029BookService bookService;

    @GetMapping("/book/{bookId}")
    public ResponseEntity<Balaji727722eucs029Book> getBookById(@PathVariable Long bookId) {
        Balaji727722eucs029Book book = bookService.getBookById(bookId);
        if (book != null) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

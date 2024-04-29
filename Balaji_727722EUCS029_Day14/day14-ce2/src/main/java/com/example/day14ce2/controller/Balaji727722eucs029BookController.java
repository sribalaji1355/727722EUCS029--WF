package com.example.day14ce2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14ce2.model.Balaji727722eucs029Book;
import com.example.day14ce2.service.Balaji727722eucs029BookService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Book Controller" ,description = "null")
public class Balaji727722eucs029BookController {
    @Autowired
    Balaji727722eucs029BookService bookService;

    @PostMapping("/api/book")
    public Balaji727722eucs029Book addBook(@RequestBody Balaji727722eucs029Book book)
    {
        return bookService.addBook(book);
    }

    @PutMapping("/api/book/{id}")
    public Balaji727722eucs029Book updateBook(@PathVariable int id,@RequestBody Balaji727722eucs029Book book)
    {
        return bookService.updateBook(id,book);
    }

    @GetMapping("/api/book")
    public List<Balaji727722eucs029Book> getBooks()
    {
        return bookService.getBooks();
    }

    @GetMapping("/api/book/{id}")
    public Optional<Balaji727722eucs029Book> getBook(@PathVariable int id)
    {
        return bookService.getBook(id);
    }
}

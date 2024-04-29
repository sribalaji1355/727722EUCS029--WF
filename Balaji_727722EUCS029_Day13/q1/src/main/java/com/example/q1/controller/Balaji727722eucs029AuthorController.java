package com.example.q1.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.example.q1.model.Balaji727722eucs029Author;
import com.example.q1.model.Balaji727722eucs029Book;
import com.example.q1.service.Balaji727722eucs029AuthorService;
import com.example.q1.service.Balaji727722eucs029BookService;

@RestController
public class Balaji727722eucs029AuthorController {
    @Autowired
    private Balaji727722eucs029AuthorService authorService;
@Autowired
private Balaji727722eucs029BookService bookService;
    @PostMapping("/author")
    public ResponseEntity<Balaji727722eucs029Author> createAuthor(@RequestBody Balaji727722eucs029Author author) {
        Balaji727722eucs029Author savedAuthor = authorService.saveAuthor(author);
        return new ResponseEntity<>(savedAuthor, HttpStatus.CREATED);
    }

    @PostMapping("/book/author/{authorId}")
    public ResponseEntity<Balaji727722eucs029Book> createBookForAuthor(@PathVariable Long authorId, @RequestBody Balaji727722eucs029Book book) {
        Balaji727722eucs029Book savedBook = bookService.saveBook(authorId, book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping("/author/{authorId}")
    public ResponseEntity<Balaji727722eucs029Author> getAuthorById(@PathVariable Long authorId) {
        Balaji727722eucs029Author author = authorService.getAuthorById(authorId);
        if (author != null) {
            return new ResponseEntity<>(author, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/author")
    public ResponseEntity<List<Balaji727722eucs029Author>> getAllAuthors() {
        List<Balaji727722eucs029Author> authors = authorService.getAllAuthors();
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }

    @PutMapping("/author/{authorId}")
    public ResponseEntity<Balaji727722eucs029Author> updateAuthor(@PathVariable Long authorId, @RequestBody Balaji727722eucs029Author author) {
        Balaji727722eucs029Author updatedAuthor = authorService.updateAuthor(authorId, author);
        if (updatedAuthor != null) {
            return new ResponseEntity<>(updatedAuthor, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable Long bookId) {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
    }
}

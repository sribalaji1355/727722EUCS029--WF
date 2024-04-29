package com.example.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.Balaji727722eucs029Author;
import com.example.q1.model.Balaji727722eucs029Book;
import com.example.q1.repository.Balaji727722eucs029AuthorRepository;
import com.example.q1.repository.Balaji727722eucs029BookRepository;
import com.example.q1.repository.Balaji727722eucs029BookRepository;

@Service
public class Balaji727722eucs029BookService {
    @Autowired
    private Balaji727722eucs029BookRepository bookRepository;
@Autowired
private Balaji727722eucs029AuthorRepository authorRepository;
    public Balaji727722eucs029Book saveBook(Long authorId, Balaji727722eucs029Book book) {
        Balaji727722eucs029Author author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public Balaji727722eucs029Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}


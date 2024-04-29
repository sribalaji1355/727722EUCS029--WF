package com.example.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.Balaji727722eucs029Author;
import com.example.q1.repository.Balaji727722eucs029AuthorRepository;

@Service
public class Balaji727722eucs029AuthorService {
    @Autowired
    private Balaji727722eucs029AuthorRepository authorRepository;

    public Balaji727722eucs029Author saveAuthor(Balaji727722eucs029Author author) {
        return authorRepository.save(author);
    }

    public Balaji727722eucs029Author getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<Balaji727722eucs029Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Balaji727722eucs029Author updateAuthor(Long id, Balaji727722eucs029Author author) {
        Balaji727722eucs029Author existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}

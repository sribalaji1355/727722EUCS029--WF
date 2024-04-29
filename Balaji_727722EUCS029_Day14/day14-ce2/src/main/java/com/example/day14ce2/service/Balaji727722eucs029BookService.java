package com.example.day14ce2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce2.model.Balaji727722eucs029Book;
import com.example.day14ce2.repository.Balaji727722eucs029BookRepo;

@Service
public class Balaji727722eucs029BookService {
   @Autowired
   Balaji727722eucs029BookRepo bookRepo;

   public Balaji727722eucs029Book addBook(Balaji727722eucs029Book book)
   {
        return bookRepo.save(book);
   }

   public List<Balaji727722eucs029Book> getBooks()
   {
        return bookRepo.findAll();
   }

   public Optional<Balaji727722eucs029Book> getBook(int id)
   {
    return bookRepo.findById(id);
   }

   public Balaji727722eucs029Book updateBook(int id,Balaji727722eucs029Book book)
   {
     Balaji727722eucs029Book avail = bookRepo.findById(id).orElse(null);
        if(avail!=null)
        {
            avail.setAuthor(book.getAuthor());
            avail.setAvailableCopies(book.getAvailableCopies());
            avail.setTitle(book.getTitle());
            avail.setTotalCopies(book.getTotalCopies());
            return bookRepo.save(avail);
        }
        else 
        return null;
   }
}

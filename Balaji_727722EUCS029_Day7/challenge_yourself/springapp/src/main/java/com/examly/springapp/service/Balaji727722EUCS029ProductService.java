package com.examly.springapp.service;

import com.examly.springapp.model.Balaji727722EUCS029Product;
import com.examly.springapp.repository.Balaji727722EUCS029ProductRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class Balaji727722EUCS029ProductService {
    @Autowired
    Balaji727722EUCS029ProductRepo repo;

    @SuppressWarnings("null")
    public boolean post(Balaji727722EUCS029Product c) {
        try {

            repo.save(c);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Balaji727722EUCS029Product> getAll() {
        return repo.findAll();

    }

    public List<Balaji727722EUCS029Product> getProduct(String age) {
        return repo.findByProductCategory(age);

    }
    public List<Balaji727722EUCS029Product> getProductbyprice(String age) {
        return repo.findByPriceCategory(age);

    }

}

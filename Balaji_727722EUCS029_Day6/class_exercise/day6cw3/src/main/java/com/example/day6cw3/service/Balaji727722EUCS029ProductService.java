package com.example.day6cw3.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cw3.model.Balaji727722EUCS029Product;
import com.example.day6cw3.repository.Balaji727722EUCS029ProductRepo;

@Service
public class Balaji727722EUCS029ProductService {
    public Balaji727722EUCS029ProductRepo productRepo;
    public Balaji727722EUCS029ProductService(Balaji727722EUCS029ProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(Balaji727722EUCS029Product product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<Balaji727722EUCS029Product> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<Balaji727722EUCS029Product> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public Balaji727722EUCS029Product getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}

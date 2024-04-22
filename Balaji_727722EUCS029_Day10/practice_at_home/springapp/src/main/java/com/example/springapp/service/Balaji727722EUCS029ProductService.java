package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Balaji727722EUCS029Product;
import com.example.springapp.repository.Balaji727722EUCS029ProductRepo;

@Service
public class Balaji727722EUCS029ProductService {
    @Autowired
    private Balaji727722EUCS029ProductRepo productRepo;

    public boolean saveProduct(Balaji727722EUCS029Product product)
    {
        try
        {
            productRepo.save(product);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public List<Balaji727722EUCS029Product> findByCategoryList(String category)
    {
        return productRepo.findByCategoryList(category);
    }

    public Balaji727722EUCS029Product updateProduct(int productId, int quantityInStock)
    {
        productRepo.updateQuantity(productId, quantityInStock);
        return productRepo.findById(productId).orElse(null);
    }

    public Balaji727722EUCS029Product deleteProduct(int productId)
    {
        productRepo.deleteProduct(productId);
        return productRepo.findById(productId).orElse(null);
    }
}
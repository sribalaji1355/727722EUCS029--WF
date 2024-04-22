package com.examly.springapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Balaji727722EUCS029Product;

@Repository
public interface Balaji727722EUCS029ProductRepo extends JpaRepository<Balaji727722EUCS029Product, Integer> {

    public List<Balaji727722EUCS029Product> findByProductCategory(String productCategory);
    public List<Balaji727722EUCS029Product> findByPriceCategory(String priceCategory);

}

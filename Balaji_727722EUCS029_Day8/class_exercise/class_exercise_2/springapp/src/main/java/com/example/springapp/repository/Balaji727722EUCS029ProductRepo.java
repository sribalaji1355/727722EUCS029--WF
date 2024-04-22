package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.Balaji727722EUCS029Product;
import java.util.List;


@Repository
public interface Balaji727722EUCS029ProductRepo extends JpaRepository<Balaji727722EUCS029Product,Integer>{

    List<Balaji727722EUCS029Product> findByProductNameStartingWith(String name);
    List<Balaji727722EUCS029Product> findByProductNameEndingWith(String name);
    
}

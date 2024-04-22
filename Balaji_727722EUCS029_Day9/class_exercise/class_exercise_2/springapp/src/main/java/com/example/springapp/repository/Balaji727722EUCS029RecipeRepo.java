package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.Balaji727722EUCS029Recipe;
import java.util.List;


@Repository
public interface Balaji727722EUCS029RecipeRepo extends JpaRepository<Balaji727722EUCS029Recipe,Integer>{

    @Query("select r from Recipe r where recipeName=?1")
    List<Balaji727722EUCS029Recipe> findByProduct(String name);
    
}

package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.Balaji727722EUCS029Person;
import java.util.List;


@Repository
public interface Balaji727722EUCS029PersonRepo extends JpaRepository<Balaji727722EUCS029Person,Integer>{

    List<Balaji727722EUCS029Person> findByLastnameNot(String lastname);
    List<Balaji727722EUCS029Person> findByAgeNotIn(List<Integer> ages);
    
}

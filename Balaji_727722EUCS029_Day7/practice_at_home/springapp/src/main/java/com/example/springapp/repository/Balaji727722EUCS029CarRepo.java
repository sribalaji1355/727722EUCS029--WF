package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.Balaji727722EUCS029Car;


@Repository
public interface Balaji727722EUCS029CarRepo extends JpaRepository<Balaji727722EUCS029Car,Integer>{

    Balaji727722EUCS029Car findDistinctBycurrentOwnerNameAndAddress(String currentOwnerName, String address); 
}

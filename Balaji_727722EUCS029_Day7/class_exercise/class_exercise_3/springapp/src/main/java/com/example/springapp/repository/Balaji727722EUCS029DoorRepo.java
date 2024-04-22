package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.Balaji727722EUCS029Door;
import java.util.List;

@Repository
public interface Balaji727722EUCS029DoorRepo extends JpaRepository<Balaji727722EUCS029Door,Integer>{

    List<Balaji727722EUCS029Door> findByDoorId(int doorId);
    List<Balaji727722EUCS029Door> findByAccessType(String accessType);
    
}

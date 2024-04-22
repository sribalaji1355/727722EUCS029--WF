package com.examly.springapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Balaji727722EUCS029Door;

// import jakarta.transaction.Transactiona

@Repository
public interface Balaji727722EUCS029DoorRepo extends JpaRepository<Balaji727722EUCS029Door, Integer> {

    @Query(value = "DELETE FROM Door WHERE Door_id = ?1", nativeQuery = true)
    void deleteDoor(int DoorId);

    public List<Balaji727722EUCS029Door> findByColor(String color);

    public List<Balaji727722EUCS029Door> findByDoorType(String doortype);
}

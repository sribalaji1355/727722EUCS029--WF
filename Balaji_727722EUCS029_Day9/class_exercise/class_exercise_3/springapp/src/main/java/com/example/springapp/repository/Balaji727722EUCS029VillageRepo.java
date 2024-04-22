package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.Balaji727722EUCS029Village;
import java.util.List;

@Repository
public interface Balaji727722EUCS029VillageRepo extends JpaRepository<Balaji727722EUCS029Village, Integer> {

    @Query("select v from Village as v where v.villageName=?1")
    Balaji727722EUCS029Village findByName(String villageName);

    @Query("select v from Village as v where v.villageId=?1")
    Balaji727722EUCS029Village findById(int id);

    @Query("select v from Village as v where v.villagePopulation=?1")
    List<Balaji727722EUCS029Village> findByPopulation(int population);

}

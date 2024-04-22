package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.examly.springapp.model.Balaji727722EUCS029Student;
import java.util.List;

@Repository
public interface Balaji727722EUCS029StudentRepo extends JpaRepository<Balaji727722EUCS029Student, Long> {

    List<Balaji727722EUCS029Student> findByMarksGreaterThan(int mark);

    List<Balaji727722EUCS029Student> findByMarksLessThan(int mark);

}

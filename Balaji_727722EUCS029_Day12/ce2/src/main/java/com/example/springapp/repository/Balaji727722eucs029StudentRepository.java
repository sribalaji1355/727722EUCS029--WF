package com.example.springapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springapp.model.Balaji727722eucs029Student;
@Repository
public interface Balaji727722eucs029StudentRepository extends JpaRepository<Balaji727722eucs029Student,Integer>{
  
    @Query(value="select s.* from student s inner join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<Balaji727722eucs029Student>getStudentInner();

    @Query(value="select s.* from student s left outer join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<Balaji727722eucs029Student> getStudentsLeftOuter();

    

    
}

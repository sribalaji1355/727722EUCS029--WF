package com.example.ce1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ce1.model.Balaji727722eucs029Employee;

public interface Balaji727722eucs029EmployeeRepo extends JpaRepository<Balaji727722eucs029Employee,Integer> {
 
    @Query(value = "SELECT e.* FROM employee e INNER JOIN address a ON e.id = a.employee_id",nativeQuery = true)
    List<Balaji727722eucs029Employee> getByInnerEmployees();

    @Query(value = "SELECT e.* FROM employee e LEFT JOIN address a ON e.id = a.employee_id",nativeQuery = true)
    List<Balaji727722eucs029Employee> getByLeftOuterEmployees();
}
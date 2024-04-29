package com.example.day14ce1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.model.Balaji727722eucs029Employee;
import com.example.day14ce1.repository.Balaji727722eucs029EmployeeRepo;

@Service

public class Balaji727722eucs029EmployeeService {
    @Autowired
    Balaji727722eucs029EmployeeRepo employeeRepo;

    public Balaji727722eucs029Employee addEmployee(Balaji727722eucs029Employee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<Balaji727722eucs029Employee> getEmployees()
    {
        return employeeRepo.findAll();
    }

    public Optional<Balaji727722eucs029Employee> getEmployee(Long employeeId)
    {
        return employeeRepo.findById(employeeId);
    }

}

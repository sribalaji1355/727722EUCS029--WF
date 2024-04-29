package com.example.ce1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.Balaji727722eucs029Employee;
import com.example.ce1.repository.Balaji727722eucs029EmployeeRepo;

@Service
public class Balaji727722eucs029EmployeeService {
    @Autowired
    Balaji727722eucs029EmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public Balaji727722eucs029Employee setEmployee(Balaji727722eucs029Employee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<Balaji727722eucs029Employee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<Balaji727722eucs029Employee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}

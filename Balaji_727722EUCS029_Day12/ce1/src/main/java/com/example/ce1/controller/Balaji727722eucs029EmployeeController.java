package com.example.ce1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce1.model.Balaji727722eucs029Employee;
import com.example.ce1.service.Balaji727722eucs029EmployeeService;

@RestController
public class Balaji727722eucs029EmployeeController {
    @Autowired
    Balaji727722eucs029EmployeeService employeeService;

    @PostMapping("/employee")
    public Balaji727722eucs029Employee setMethod(@RequestBody Balaji727722eucs029Employee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<Balaji727722eucs029Employee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<Balaji727722eucs029Employee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}

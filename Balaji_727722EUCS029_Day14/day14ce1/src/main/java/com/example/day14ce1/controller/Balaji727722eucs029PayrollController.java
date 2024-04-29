package com.example.day14ce1.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14ce1.model.Balaji727722eucs029Payroll;
import com.example.day14ce1.service.Balaji727722eucs029PayrollService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class Balaji727722eucs029PayrollController {
    @Autowired
    Balaji727722eucs029PayrollService PayrollService;

    @PutMapping("/employee/{employeeId}/payroll")
    public Balaji727722eucs029Payroll addPayroll(@PathVariable Long employeeId,@RequestBody Balaji727722eucs029Payroll payroll) {
        return PayrollService.addPayroll(employeeId,payroll);
    }

    @GetMapping("/employee/{employeeId}/payroll")
    public Optional<Balaji727722eucs029Payroll> getMethodName(@PathVariable Long employeeId) {
        return PayrollService.getPayroll(employeeId);
    }
    
    
}

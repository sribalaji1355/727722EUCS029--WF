package com.example.day6cy.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cy.model.Balaji727722EUCS029Employee;
import com.example.day6cy.repository.Balaji727722EUCS029EmployeeRepo;

@Service
public class Balaji727722EUCS029EmployeeService {
    public Balaji727722EUCS029EmployeeRepo employeeRepo;
    public Balaji727722EUCS029EmployeeService(Balaji727722EUCS029EmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean postEmployee(Balaji727722EUCS029Employee employee)
    {
        try{

            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<Balaji727722EUCS029Employee> sortEmployee(String field)
    {
        return employeeRepo.findAll(Sort.by(field));
    }
    public List<Balaji727722EUCS029Employee> paginationEmployee(int pageno,int size)
    {
        return employeeRepo.findAll(PageRequest.of(pageno, size)).getContent();
    }
    public List<Balaji727722EUCS029Employee>  sortPaginationEmployee(int pageno,int size,String field)
    {
        return employeeRepo.findAll(PageRequest.of(pageno, size,Sort.by(field))).getContent();
    }
}

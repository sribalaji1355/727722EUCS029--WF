package com.example.day14ce1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.model.Balaji727722eucs029Payroll;
import com.example.day14ce1.repository.Balaji727722eucs029PayrollRepo;

@Service
public class Balaji727722eucs029PayrollService {
    @Autowired
    Balaji727722eucs029PayrollRepo payrollRepo;

    public Balaji727722eucs029Payroll addPayroll(Long id,Balaji727722eucs029Payroll payroll)
    {
        Balaji727722eucs029Payroll avail = payrollRepo.findById(id).orElse(null);

        if(avail!=null){
            avail.setAmount(payroll.getAmount());
            avail.setNoOfDaysWorked(payroll.getNoOfDaysWorked());
        return payrollRepo.save(avail);
        }
        else 
        return null;
    }

    public Optional<Balaji727722eucs029Payroll> getPayroll(Long employeeId)
    {
        return payrollRepo.findById(employeeId);
    }
}

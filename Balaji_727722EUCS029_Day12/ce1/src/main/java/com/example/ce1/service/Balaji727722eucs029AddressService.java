package com.example.ce1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.Balaji727722eucs029Address;
import com.example.ce1.repository.Balaji727722eucs029AddressRepo;
import com.example.ce1.repository.Balaji727722eucs029EmployeeRepo;

@Service
public class Balaji727722eucs029AddressService {
    @Autowired
    Balaji727722eucs029AddressRepo addressRepo;
    @Autowired
    Balaji727722eucs029EmployeeRepo employeeRepo;
    public Balaji727722eucs029Address setAddressById(int id,Balaji727722eucs029Address address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}

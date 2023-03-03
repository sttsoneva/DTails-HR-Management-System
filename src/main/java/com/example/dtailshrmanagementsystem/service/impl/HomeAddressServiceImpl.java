package com.example.dtailshrmanagementsystem.service.impl;

import com.example.dtailshrmanagementsystem.model.entity.HomeAddress;
import com.example.dtailshrmanagementsystem.repository.EmployeeRepository;
import com.example.dtailshrmanagementsystem.repository.HomeAddressRepository;
import com.example.dtailshrmanagementsystem.service.HomeAddressService;
import org.springframework.stereotype.Service;

@Service
public class HomeAddressServiceImpl implements HomeAddressService {

    private final EmployeeRepository employeeRepository;
    private final HomeAddressRepository homeAddressRepository;

    public HomeAddressServiceImpl(EmployeeRepository employeeRepository, HomeAddressRepository homeAddressRepository){
        this.employeeRepository = employeeRepository;
        this.homeAddressRepository = homeAddressRepository;

    }
    @Override
    public void addAddress() {
        HomeAddress homeAddress = new HomeAddress("May Road", "Twickenham", null, "TW1 5TT", "UK");
        homeAddressRepository.save(homeAddress);
    }
}

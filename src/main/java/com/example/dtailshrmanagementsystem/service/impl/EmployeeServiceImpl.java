package com.example.dtailshrmanagementsystem.service.impl;

import com.example.dtailshrmanagementsystem.model.entity.Employee;
import com.example.dtailshrmanagementsystem.model.entity.HomeAddress;
import com.example.dtailshrmanagementsystem.repository.EmployeeRepository;
import com.example.dtailshrmanagementsystem.repository.HomeAddressRepository;
import com.example.dtailshrmanagementsystem.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final HomeAddressRepository homeAddressRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, HomeAddressRepository homeAddressRepository) {
        this.employeeRepository = employeeRepository;
        this.homeAddressRepository = homeAddressRepository;
    }

    @Override
    public void addNewEmployee() {

        HomeAddress homeAddress = new HomeAddress("May Road", "Twickenham","London", "TW2 6RF", "UK");
        Employee testEmployee = new Employee("Fred", "Flintstone", LocalDate.of(1987, 10, 19), "SS587259S",LocalDate.of(2021,4,21),"fred.flintstone@myworkemail.com", null, homeAddress);

        homeAddressRepository.save(homeAddress);
        employeeRepository.save(testEmployee);

    }
}

package com.example.dtailshrmanagementsystem.service.impl;

import com.example.dtailshrmanagementsystem.model.entity.Employee;
import com.example.dtailshrmanagementsystem.repository.EmployeeRepository;
import com.example.dtailshrmanagementsystem.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void addNewEmployee() {
        Employee testEmployee = new Employee("Fred", "Flintstone", LocalDate.of(1987, 10, 19), "SS587259S",LocalDate.of(2021,04,23),"f.flintstone@myworkemail.com", null);

        employeeRepository.save(testEmployee);
    }
}

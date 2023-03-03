package com.example.dtailshrmanagementsystem;

import com.example.dtailshrmanagementsystem.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    private final EmployeeService employeeService;

    public CommandLineRunnerImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public void run(String... args) throws Exception {
        addEmployee();
    }

    private void addEmployee() {
        employeeService.addNewEmployee();
    }

}

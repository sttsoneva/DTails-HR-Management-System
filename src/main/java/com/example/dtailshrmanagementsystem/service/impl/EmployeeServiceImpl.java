package com.example.dtailshrmanagementsystem.service.impl;

import com.example.dtailshrmanagementsystem.model.entity.Employee;
import com.example.dtailshrmanagementsystem.model.entity.HomeAddress;
import com.example.dtailshrmanagementsystem.repository.EmployeeRepository;
import com.example.dtailshrmanagementsystem.repository.HomeAddressRepository;
import com.example.dtailshrmanagementsystem.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

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

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter employee's first name");
        String firstName = scan.nextLine();

        System.out.println("Please enter employee's last name");
        String lastName = scan.nextLine();

        System.out.println("Please enter employee's Date of Birth");
        LocalDate dateOfBirth = getLocalDate();

        System.out.println("Please enter employee's National Insurance Number");
        String nationalInsuranceNumber = scan.nextLine();

        System.out.println("Please enter employee's start date");
        LocalDate continuousServiceDate = getLocalDate();

        System.out.println("Please enter employee's work email address");
        String workEmail = scan.nextLine();

        LocalDate dateLeft;

        System.out.println("Please enter employee's home address");
        System.out.println("First Line");
        String firstLineOfAddress = scan.nextLine();

        System.out.println("Second Line");
        String secondLineOfAddress = scan.nextLine();

        System.out.println("Town");
        String thirdLineOfAddress = scan.nextLine();

        System.out.println("Post Code");
        String postCode = scan.nextLine();

        System.out.println("Country");
        String country = scan.nextLine();

        HomeAddress homeAddress = new HomeAddress(firstLineOfAddress, secondLineOfAddress,thirdLineOfAddress, postCode, country);

        Employee testEmployee = new Employee(firstName, lastName, dateOfBirth, nationalInsuranceNumber,continuousServiceDate,workEmail, null, homeAddress);

        homeAddressRepository.save(homeAddress);
        employeeRepository.save(testEmployee);

    }

    private LocalDate getLocalDate() {
        Scanner scan = new Scanner(System.in);
        LocalDate date = null;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Enter date in format yyyy-MM-dd");
                String input = scan.nextLine();
                date = LocalDate.parse(input);
                validInput = true;
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format, please try again");
            }
        }

        while (date.isAfter(LocalDate.now())) {
            System.out.println("Date cannot be in the future. Please enter a valid date");
            try {
                String input = scan.nextLine();
                date = LocalDate.parse(input);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format, please try again");
            }
        }

        return date;
    }
}

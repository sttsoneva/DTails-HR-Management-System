package com.example.dtailshrmanagementsystem.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "employee")
public class Employee {

    private Long id;
    private String firstName;
    private String lastName;
    private String initials;
    private LocalDate dateOfBirth;
    private String nationalInsuranceNumber;
    private LocalDate continuousServiceDate;

}

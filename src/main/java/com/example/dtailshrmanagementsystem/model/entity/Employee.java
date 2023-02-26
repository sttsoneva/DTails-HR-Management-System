package com.example.dtailshrmanagementsystem.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
public class Employee {

    public Employee() {

    }

    private Long id;
    private String firstName;
    private String lastName;
    private String initials;
    private LocalDate dateOfBirth;
    private int ageYears;
    private int ageMonths;
    private String nationalInsuranceNumber;
    private LocalDate continuousServiceDate;
    private int lengthOfServiceYears;
    private int lengthOfServiceMonths;
    private String workEmail;
    private LocalDate dateLeft;

    public Employee(Long id, String firstName, String lastName, String initials, LocalDate dateOfBirth, String nationalInsuranceNumber, LocalDate continuousServiceDate, String workEmail, LocalDate dateLeft){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.initials = initials;
        this.dateOfBirth = dateOfBirth;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.continuousServiceDate = continuousServiceDate;
        this.workEmail = workEmail;
        this.dateLeft = dateLeft;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "initials")
    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    @Column(name = "date_of_birth")
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Column(name = "age_years")
    public int getAgeYears() {
        return ageYears;
    }

    public void setAgeYears(int ageYears) {
        this.ageYears = ageYears;
    }

    @Column(name = "age_months")
    public int getAgeMonths() {
        return ageMonths;
    }

    public void setAgeMonths(int ageMonths) {
        this.ageMonths = ageMonths;
    }

    @Column(name = "NINo")
    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    @Column(name = "continuous_service_date")
    public LocalDate getContinuousServiceDate() {
        return continuousServiceDate;
    }

    public void setContinuousServiceDate(LocalDate continuousServiceDate) {
        this.continuousServiceDate = continuousServiceDate;
    }
    @Column(name = "length_of_service_years")
    public int getLengthOfServiceYears() {
        return lengthOfServiceYears;
    }

    public void setLengthOfServiceYears(int lengthOfServiceYears) {
        this.lengthOfServiceYears = lengthOfServiceYears;
    }
    @Column(name = "length_of_service_months")
    public int getLengthOfServiceMonths() {
        return lengthOfServiceMonths;
    }

    public void setLengthOfServiceMonths(int lengthOfServiceMonths) {
        this.lengthOfServiceMonths = lengthOfServiceMonths;
    }

    @Column(name = "work_email_address")
    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    @Column(name = "left_date")
    public LocalDate getDateLeft() {
        return dateLeft;
    }

    public void setDateLeft(LocalDate dateLeft) {
        this.dateLeft = dateLeft;
    }

}

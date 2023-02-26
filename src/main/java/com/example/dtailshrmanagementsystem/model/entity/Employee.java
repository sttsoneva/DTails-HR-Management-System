package com.example.dtailshrmanagementsystem.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
public class Employee extends BaseEntity{

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

    public Employee() {

    }

    public Employee( String firstName, String lastName,LocalDate dateOfBirth, String nationalInsuranceNumber, LocalDate continuousServiceDate, String workEmail, LocalDate dateLeft){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.continuousServiceDate = continuousServiceDate;
        this.workEmail = workEmail;
        this.dateLeft = dateLeft;

    }

    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = false)
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

    @Column(name = "date_of_birth", nullable = false)
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

    @Column(name = "NINo", nullable = false)
    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    @Column(name = "continuous_service_date", nullable = false)
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

    @Column(name = "work_email_address", nullable = false)
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

package com.example.dtailshrmanagementsystem.model.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "employees", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"NINo", "work_email_address"})
})
public class Employee extends BaseEntity {

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

    private HomeAddress homeAddress;

    public Employee(){};


    public Employee(String firstName, String lastName, LocalDate dateOfBirth, String nationalInsuranceNumber, LocalDate continuousServiceDate, String workEmail, LocalDate dateLeft, HomeAddress homeAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.initials = calculateInitials(firstName, lastName);
        this.dateOfBirth = dateOfBirth;
        this.ageYears = calculateAgeYears(dateOfBirth);
        this.ageMonths = calculateAgeMonths(dateOfBirth);
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.continuousServiceDate = continuousServiceDate;
        this.lengthOfServiceYears = calculateLengthOfServiceYears(continuousServiceDate);
        this.lengthOfServiceMonths = calculateLengthOfServiceMonths(continuousServiceDate);
        this.workEmail = workEmail;
        this.dateLeft = dateLeft;
        this.homeAddress = homeAddress;
    }

    private int calculateLengthOfServiceMonths(LocalDate continuousServiceDate) {
        LocalDate dateToday = LocalDate.now();

        return Period.between(continuousServiceDate, dateToday).getMonths();
    }

    private int calculateLengthOfServiceYears(LocalDate continuousServiceDate) {
        LocalDate dateToday = LocalDate.now();

        return Period.between(continuousServiceDate, dateToday).getYears();
    }

    private int calculateAgeMonths(LocalDate dateOfBirth) {
        LocalDate dateToday = LocalDate.now();

        return Period.between(dateOfBirth, dateToday).getMonths();
    }

    private int calculateAgeYears(LocalDate dateOfBirth) {
        LocalDate dateToday = LocalDate.now();

        return Period.between(dateOfBirth, dateToday).getYears();
    }

    private String calculateInitials(String firstName, String lastName) {
        StringBuilder initials = new StringBuilder();

        initials.append(Character.toUpperCase(firstName.charAt(0)));
        initials.append(Character.toUpperCase(lastName.charAt(0)));

        return initials.toString();
    }

    @Column(name = "first_name", columnDefinition = "VARCHAR(50) NOT NULL", nullable = false)
    @Pattern(regexp = "^[A-Z][a-z]*$")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", columnDefinition = "VARCHAR(50) NOT NULL", nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "initials")
    @Pattern(regexp = "[A-Z]{2}")
    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    @Column(name = "date_of_birth", nullable = false)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
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
    @DateTimeFormat(pattern = "dd-MM-yyyy")
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

    @OneToOne
    public HomeAddress getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(HomeAddress homeAddress) {
        this.homeAddress = homeAddress;
    }
}

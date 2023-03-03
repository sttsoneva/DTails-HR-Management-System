package com.example.dtailshrmanagementsystem.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="home_address")
public class HomeAddress extends BaseEntity {

    private String firstLineOfAddress;
    private String secondLineOfAddress;
    private String thirdLineOfAddress;
    private String postCode;
    private String country;

    public HomeAddress(){

    }

    public HomeAddress(String firstLineOfAddress, String secondLineOfAddress, String thirdLineOfAddress, String postCode, String country){
        this.firstLineOfAddress = firstLineOfAddress;
        this.secondLineOfAddress = secondLineOfAddress;
        this.thirdLineOfAddress = thirdLineOfAddress;
        this.postCode = postCode;
        this.country = country;
    }

    @Column(name="first_line_address", columnDefinition = "VARCHAR(50) NOT NULL", nullable = false)
    public String getFirstLineOfAddress() {
        return firstLineOfAddress;
    }

    public void setFirstLineOfAddress(String firstLineOfAddress) {
        this.firstLineOfAddress = firstLineOfAddress;
    }

    @Column(name="second_line_address", columnDefinition = "VARCHAR(50) NOT NULL", nullable = false)
    public String getSecondLineOfAddress() {
        return secondLineOfAddress;
    }

    public void setSecondLineOfAddress(String secondLineOfAddress) {
        this.secondLineOfAddress = secondLineOfAddress;
    }

    @Column(name="third_line_address")
    public String getThirdLineOfAddress() {
        return thirdLineOfAddress;
    }

    public void setThirdLineOfAddress(String thirdLineOfAddress) {
        this.thirdLineOfAddress = thirdLineOfAddress;
    }

    @Column(name="post_code", columnDefinition = "VARCHAR(50) NOT NULL",nullable = false)
    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Column(name="country", columnDefinition = "VARCHAR(50) NOT NULL", nullable = false)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

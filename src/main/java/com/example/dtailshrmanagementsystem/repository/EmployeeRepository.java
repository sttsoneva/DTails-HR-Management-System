package com.example.dtailshrmanagementsystem.repository;

import com.example.dtailshrmanagementsystem.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

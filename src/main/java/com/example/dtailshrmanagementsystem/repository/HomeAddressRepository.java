package com.example.dtailshrmanagementsystem.repository;

import com.example.dtailshrmanagementsystem.model.entity.HomeAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeAddressRepository extends JpaRepository<HomeAddress, Long> {
}

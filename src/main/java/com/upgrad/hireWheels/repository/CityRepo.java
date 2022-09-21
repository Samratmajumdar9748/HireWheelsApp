package com.upgrad.hireWheels.repository;

import com.upgrad.hireWheels.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CityRepo extends JpaRepository<City, Integer> {
}

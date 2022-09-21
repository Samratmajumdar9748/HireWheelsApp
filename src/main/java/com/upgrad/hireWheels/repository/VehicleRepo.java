package com.upgrad.hireWheels.repository;

import com.upgrad.hireWheels.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Vehicle,Integer> {
}

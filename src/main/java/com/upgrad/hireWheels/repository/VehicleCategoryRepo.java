package com.upgrad.hireWheels.repository;

import com.upgrad.hireWheels.entities.VehicleCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleCategoryRepo extends JpaRepository<VehicleCategory,Integer> {
}

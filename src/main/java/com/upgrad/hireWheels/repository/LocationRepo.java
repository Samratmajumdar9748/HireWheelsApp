package com.upgrad.hireWheels.repository;

import com.upgrad.hireWheels.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepo extends JpaRepository<Location,Integer> {
}

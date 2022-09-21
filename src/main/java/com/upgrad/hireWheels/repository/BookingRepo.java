package com.upgrad.hireWheels.repository;

import com.upgrad.hireWheels.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<Booking,Integer> {
}

package com.upgrad.hireWheels.repository;

import com.upgrad.hireWheels.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}

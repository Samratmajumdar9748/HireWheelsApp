package com.upgrad.hireWheels.repository;

import com.upgrad.hireWheels.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User,Integer> {
    User findByFirstNameIgnoreCase(String firstName);

    User findByFirstNameIgnoreCaseOrLastNameIgnoreCase(String firstName, String lastName);

    User findByEmailIgnoreCase(String email);

    User findByMobileNo(int mobileNo);
}

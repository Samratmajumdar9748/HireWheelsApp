package com.upgrad.hireWheels.entities;

import javax.persistence.*;

@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vehicle_id",nullable = false,precision = 10)
    private int vehicleId;

    @Column(nullable = false)
    private String vehicleModel;

    @Column(length = 10,nullable = false)
    private String vehicleNumber;

    @Column(length = 50, nullable = false)
    private String color;

    @Column(nullable = false,precision = 1)
    private int availabilityStatus;

    @Column(nullable = false,length = 500)
    private String vehicleImageUrl;

}

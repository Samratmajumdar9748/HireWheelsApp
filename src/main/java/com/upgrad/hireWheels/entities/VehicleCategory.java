package com.upgrad.hireWheels.entities;

import javax.persistence.*;

@Entity
public class VehicleCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(precision = 10)
    private int vehicleCategoryId;

    @Column(length = 50, unique = true,nullable = false)
    private String vehicleCategoryName;

    @Override
    public String toString() {
        return "VehicleCategory{" +
                "vehicleCategoryId=" + vehicleCategoryId +
                ", vehicleCategoryName='" + vehicleCategoryName + '\'' +
                '}';
    }

    public int getVehicleCategoryId() {
        return vehicleCategoryId;
    }

    public String getVehicleCategoryName() {
        return vehicleCategoryName;
    }

    public void setVehicleCategoryName(String vehicleCategoryName) {
        this.vehicleCategoryName = vehicleCategoryName;
    }
}

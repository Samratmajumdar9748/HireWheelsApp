package com.upgrad.hireWheels.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FuelType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int fuelTypeId;

    @Column(length = 50,nullable = false,unique = true)
    private String fuelType;

    @OneToMany(mappedBy = "fuelType",cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
    private Set<Vehicle> vehicles;
    @Override
    public String toString() {
        return "FuelType{" +
                "fuelTypeId=" + fuelTypeId +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

    public Set<Vehicle> getVehicles() {
        return vehicles;
    }

    public int getFuelTypeId() {
        return fuelTypeId;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}

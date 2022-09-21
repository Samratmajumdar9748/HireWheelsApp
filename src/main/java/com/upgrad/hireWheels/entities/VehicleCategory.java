package com.upgrad.hireWheels.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class VehicleCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(precision = 10)
    private int vehicleCategoryId;

    @Column(length = 50, unique = true,nullable = false)
    private String vehicleCategoryName;

    @OneToMany(mappedBy = "vehicleCategory",fetch = FetchType.EAGER,cascade = {CascadeType.ALL})
    private Set<VehicleSubcategory> vehicleSubcategories;

    @Override
    public String toString() {
        return "VehicleCategory{" +
                "vehicleCategoryId=" + vehicleCategoryId +
                ", vehicleCategoryName='" + vehicleCategoryName + '\'' +
                '}';
    }

    public Set<VehicleSubcategory> getVehicleSubcategories() {
        return vehicleSubcategories;
    }

    public void setVehicleCategoryId(int vehicleCategoryId) {
        this.vehicleCategoryId = vehicleCategoryId;
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

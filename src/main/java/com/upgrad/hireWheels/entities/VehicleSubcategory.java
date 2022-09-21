package com.upgrad.hireWheels.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class VehicleSubcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private int vehicleSubcategoryId;

    @Column(length = 50,nullable = false,unique = true)
    private String vehicleSubcategoryName;

    @Column(precision = 10,scale = 2,nullable = false)
    private float pricePerDay;

    @OneToMany(mappedBy = "vehicleSubcategory",fetch = FetchType.EAGER,cascade = {CascadeType.ALL})
    private Set<Vehicle> vehicles;

    @ManyToOne
    @JoinColumn(name = "vehicleCategoryId",nullable = false)
    private VehicleCategory vehicleCategory;

    @Override
    public String toString() {
        return "VehicleSubcategory{" +
                "vehicleSubcategoryId=" + vehicleSubcategoryId +
                ", vehicleSubcategoryName='" + vehicleSubcategoryName + '\'' +
                ", pricePerDay=" + pricePerDay +
                ", vehicleCategory=" + vehicleCategory +
                '}';
    }

    public VehicleCategory getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(VehicleCategory vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public int getVehicleSubcategoryId() {
        return vehicleSubcategoryId;
    }

    public String getVehicleSubcategoryName() {
        return vehicleSubcategoryName;
    }

    public void setVehicleSubcategoryName(String vehicleSubcategoryName) {
        this.vehicleSubcategoryName = vehicleSubcategoryName;
    }

    public float getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(float pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}

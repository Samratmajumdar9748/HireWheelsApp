package com.upgrad.hireWheels.entities;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy = "vehicle",fetch = FetchType.EAGER,cascade = {CascadeType.ALL})
    private List<Booking> bookingList;

    @ManyToOne
    @JoinColumn(name = "fuelTypeId",nullable = false)
    private FuelType fuelType;

    @ManyToOne
    @JoinColumn(name = "locationId",nullable = false)
    private Location location;

    @ManyToOne
    @JoinColumn(name = "vehicleSubcategoryId")
    private VehicleSubcategory vehicleSubcategory;

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", color='" + color + '\'' +
                ", availabilityStatus=" + availabilityStatus +
                ", vehicleImageUrl='" + vehicleImageUrl + '\'' +
                ", fuelType=" + fuelType +
                ", location=" + location +
                ", vehicleSubcategory=" + vehicleSubcategory +
                '}';
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public VehicleSubcategory getVehicleSubcategory() {
        return vehicleSubcategory;
    }

    public void setVehicleSubcategory(VehicleSubcategory vehicleSubcategory) {
        this.vehicleSubcategory = vehicleSubcategory;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(int availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public String getVehicleImageUrl() {
        return vehicleImageUrl;
    }

    public void setVehicleImageUrl(String vehicleImageUrl) {
        this.vehicleImageUrl = vehicleImageUrl;
    }
}

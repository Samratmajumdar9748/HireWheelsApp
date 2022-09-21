package com.upgrad.hireWheels.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int locationId;

    @Column(length = 50,nullable = false)
    private String locationName;

    @Column(nullable = false,length = 100)
    private String address;

    @Column(length = 6, nullable = false)
    private String pincode;

    @OneToMany(mappedBy = "location",fetch = FetchType.EAGER,cascade = {CascadeType.ALL})
    private List<Booking> bookings;

    @ManyToOne
    @JoinColumn(name = "city_id",nullable = false)
    private City city;

    @OneToMany(mappedBy = "location",fetch = FetchType.EAGER,cascade = {CascadeType.ALL})
    private Set<Vehicle> vehicles;

    @Override
    public String toString() {
        return "Location{" +
                "locationId=" + locationId +
                ", locationName='" + locationName + '\'' +
                ", address='" + address + '\'' +
                ", pincode='" + pincode + '\'' +
                ", city=" + city +
                '}';
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public Set<Vehicle> getVehicles() {
        return vehicles;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getLocationId() {
        return locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}

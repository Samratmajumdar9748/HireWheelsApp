package com.upgrad.hireWheels.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cityId;

    @Column(nullable = false,length = 50)
    private String cityName;

    @OneToMany(mappedBy = "city",cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
    private List<Location> locationList;

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                '}';
    }

    public List<Location> getLocationList() {
        return locationList;
    }

    public int getCityId() {
        return cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}


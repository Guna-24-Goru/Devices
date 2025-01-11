package com.devices.Devices.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Device {
    @Id
    @Column
    String deviceName;
    @Column
    Double price;
    @Column
    Integer year;
     Device(){}

    public Device( String deviceName, Double price, Integer year) {
        this.deviceName = deviceName;
        this.price = price;
        this.year = year;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}

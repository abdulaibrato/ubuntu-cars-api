package com.ubuntu.ubuntucarsapi.model.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CARS")
public class Car implements Serializable {

    private int id;
    private String brand;
    private String model;
    private Double price;
    private String colour;
    private Integer power;
    private Integer mileage;
    private boolean newCar;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BRAND", nullable = false, length = 20)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Basic
    @Column(name = "MODEL", nullable = false, length = 35)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "PRICE", nullable = false)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "COLOUR", nullable = true, length = 20)
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Basic
    @Column(name = "POWER", nullable = true)
    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Basic
    @Column(name = "MILEAGE", nullable = true)
    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    @Basic
    @Column(name = "NEW", nullable = false)
    public boolean isNewCar() {
        return newCar;
    }

    public void setNewCar(boolean newCar) {
        this.newCar = newCar;
    }
}

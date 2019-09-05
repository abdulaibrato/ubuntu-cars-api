package com.ubuntu.ubuntucarsapi.domain;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "CARS")
public class Car implements Serializable {
    private int id;
    private String brand;
    private String model;
    private int price;
    private String colour;
    private int power;
    private int mileage;
    private boolean New;
//    getters and setters
    @Id
    @Column(name = "ID", length = 10, precision = 0)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() { return id;}
    public void setId(int id) { this.id = id;}

    @Basic
    @Column(name = "BRAND", nullable = false, length = 20)
    public String getBrand() { return brand;}
    public void setBrand(String brand) { this.brand = brand;}

    @Basic
    @Column(name = "MODEL", nullable = false, length = 35)
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}

    @Basic
    @Column(name = "PRICE", nullable = false, length = 8)
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

    @Basic
    @Column(name = "COLOUR", nullable = true, length = 15)
    public String getColour() {return colour;}
    public void setColour(String colour) {this.colour = colour;}

    @Basic
    @Column(name = "POWER", nullable = true, length = 3)
    public int getPower() {return power;}
    public void setPower(int power) {this.power = power;}

    @Basic
    @Column(name = "MILEAGE", nullable = true, length = 6)
    public int getMileage() {return mileage;}
    public void setMileage(int mileage) {this.mileage = mileage;}

    @Basic
    @Column(name = "NEW", nullable = false, length = 6)
    public boolean isNew() { return New; }
    public void setNew(boolean aNew) { New = aNew;}

    //    create a car class constructor
    public Car(int id, String brand, String model, int price, String colour, int power, int mileage, boolean aNew) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.colour = colour;
        this.power = power;
        this.mileage = mileage;
        New = aNew;
    }
    //    create an empty constructor
    public Car() {
    }
}

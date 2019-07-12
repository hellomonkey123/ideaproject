package com.jvm.test.DeepClone;

import java.io.Serializable;

/**
 * @program: Car
 * @description:
 * @author: liu yuanwen
 * @create: 2019/6/21
 */
public class Car implements Serializable {

    private static final long serialVersionUID = -5713945027627603702L;

    private String brand;
    private int maxSpeed;

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

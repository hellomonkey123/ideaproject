package com.jvm.test.DeepClone;

import java.io.Serializable;

/**
 * @program: Person
 * @description:
 * @author: liu yuanwen
 * @create: 2019/6/21
 */
public class Person implements Serializable {

    private static final long serialVersionUID = -9102017020286042305L;

    private String name;
    private int age;
    private Car car;

    /**
     *
     * @param name
     * @param age
     * @param car
     */
    public Person( String name, int age, Car car){

        this.age = age;
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}

package com.designer.test;

import java.util.Hashtable;

/**
 * @program: Car
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/23
 */
public class Car {
    public void run() {
        System.out.println("这是父类run()方法");
    }

    public void speed() {
        System.out.println("speed:0");
    }

}

class BMW extends Car {
    public void run() {
        System.out.println("这是BMW的run()方法");
    }

    public void speed() {
        System.out.println("speed:80");
    }
}

class Benz extends Car {
    public void run() {
        System.out.println("这是Benz的run()方法");

    }

    public void speed() {
        System.out.println("speed:100");
    }

    public void price() {
        System.out.println("Benz:800000$");
    }

    public static void main(String[] args) {
        //show(new Benz());//向上转型实现
        //show(new BMW());
        Car car =  new Benz(); //向上转型
        car.run();
        car.speed();
        ((Benz) car).price(); //向下转型

    }

    public static void show(Car car) {//父类实例作为参数
        car.run();
        car.speed();
    }
}
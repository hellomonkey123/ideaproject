package com.jvm.test.DeepClone;

import org.junit.Test;

/**
 * @program: CloneTest
 * @description:
 * @author: liu yuanwen
 * @create: 2019/6/21
 */
public class CloneTest {

    @Test
    public void CloneTest(){
        try{
            Person p1 = new Person("郭靖", 33, new Car("Benz", 300));
            Person p2 = MyUtil.clone(p1);
            p2.getCar().setBrand("BYD");

            System.out.println(p1);
            System.out.println(p2);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

package com.basicpractic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * @program: RelectTest
 * @description:
 * @author: liu yuanwen
 * @create: 2019/8/8
 */
public class RelectTest {

    public static void main(String[] args){
        try {
            Class clazz = Class.forName("com.jvm.test.MyStack");

            System.out.println("打印所有申明方法");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods)
                System.out.println(method.toString());
            System.out.println("--------------------");

            System.out.println("打印所有成员属性");
            Field[] fields = clazz.getDeclaredFields();
            for (Field field :fields)
                System.out.println(field.toString());
            System.out.println("--------------------");

            System.out.println("打印所有构造方法");
            Constructor[] constructors = clazz.getDeclaredConstructors();
            for (Constructor constructor : constructors)
                System.out.println(constructor.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

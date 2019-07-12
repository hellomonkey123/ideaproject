package com.jvm.test;

/**
 * @program: ConstuctorUseOrder
 * @description:
 * @author: liu yuanwen
 * @create: 2019/6/21
 */
class A {

    static {
        System.out.print("1");
    }

    public A() {
        System.out.print("2");
    }

}

class B extends A {

    static {
        System.out.print("a");
    }

    public B() {
        System.out.print("b");
    }
}

public class ConstuctorUseOrder {

    public static void main(String[] args) {
        //先父类静态方法，再子类静态方法，再父类构造器，再子类构造器
        A ab = new B();  //1a2b
        //父类构造器，再子类构造器
        ab = new B();  //2b
    }

}


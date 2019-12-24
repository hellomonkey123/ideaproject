package com.basicpractic;

import java.util.PriorityQueue;
import java.util.function.Consumer;

/**
 * @program: AnomiticInnerClass
 * @description:
 * @author: liu yuanwen
 * @create: 2019/8/13
 */
//匿名内部类

class C{
    public void show(){
        System.out.println(" C hello");
    }
    class B{
        public void show(){
            System.out.println("B hello");
        }
    }
}
//通过private 保证数据的安全性 并且static可以让数据访问更方便
class D{
    private static int num = 20;
    final static int aa = 100;
    public static void show2(){
        System.out.println("show2 hello");
    }

    private static class B{
        int aa;
        public void show(){
            num++;
            int ss = 5;
            System.out.println(num);
            System.out.println(this.aa);
            show2();
            class inncl{
                private int ss = 4;
                public void testN(){
                    System.out.println(this.ss);
                }

            }
            new inncl().testN();

        }
    }

    public void show1(){
        B b = new B();
        b.show();
        //B bb = new B.
    }
}
public class AnomiticInnerClass {
    public static void main(String[] args){
        C.B an = new C().new B();
        int ss = 99;
        Consumer<Integer>  djk = hh -> System.out.println("jdl");
        System.out.println();
        an.show();

        PriorityQueue q = new PriorityQueue();
        q.add("fkl");


        D dd = new D();
        dd.show1();

    }

}

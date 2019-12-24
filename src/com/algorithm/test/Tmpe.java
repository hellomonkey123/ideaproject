package com.algorithm.test;

import java.util.ArrayList;

/**
 * @program: Tmpe
 * @description:
 * @author: liu yuanwen
 * @create: 2019/8/24
 */
public class Tmpe {
    public static void main(String[] args){
        System.out.println(isA("Admin"));
        ArrayList<Integer> list = new ArrayList<>(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.size());
    }
    public static boolean isA(String us){
        return us.toLowerCase() == "admin";
    }
}

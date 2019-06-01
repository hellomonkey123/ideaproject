package com.algorithm.test;

import org.junit.Test;

import java.util.TreeMap;

public class MycalendarTwo {
    //遇到三重预定则返回false，少于三重则返回true并保存
    private static TreeMap<Integer, Integer> calendar;

    public  MycalendarTwo(){
        calendar = new TreeMap<>();
    }

    public static boolean book(int start, int end){
        //一旦后面添加的不在原来那个范围必有一个 -1 进行抵消，思路很好
        calendar.put(start,calendar.getOrDefault(start,0) + 1);
        calendar.put(end, calendar.getOrDefault(end, 0) - 1);
        //
        int active = 0;
        for (int d : calendar.values()){
            active += d;

            if (active > 2){
                //还原添加的产生三重预定的数据
                calendar.put(start, calendar.get(start) - 1);
                calendar.put(end, calendar.get(end) + 1);

                if (calendar.get(start) == 0)
                    calendar.remove(start);
                return false;
            }
        }
        return true;
    }

    @Test
    public void test(){
        new MycalendarTwo();
        MycalendarTwo.book(11, 20); // returns true
        MycalendarTwo.book(50, 60); // returns true
        MycalendarTwo.book(10, 40); // returns true
        MycalendarTwo.book(21, 25); // returns false
        MycalendarTwo.book(5, 10); // returns true
        MycalendarTwo.book(25, 55); // returns true
        System.out.println(calendar);
    }
}

package com.algorithm.test;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class MyCalendar {

    //提交日程，如果原日程没有新提交，则返回true，并且新提交更新到日程，否则返回false
    private static TreeMap<Integer,Integer> calendar;
    public  MyCalendar(){
        calendar = new TreeMap<>();
    }

    public static boolean book(int start, int end){
        //获取start之间的两个Key
        Integer prev = calendar.floorKey(start);
        Integer next = calendar.ceilingKey(start);
        //calendar.get(prev)是最小start对应的end
        if ((prev == null || calendar.get(prev) <= start) && (next == null || end <= next)){
            calendar.put(start,end);
            return true;
        }
        return false;
    }

    @Test
    public void test(){
        new MyCalendar();
        MyCalendar.book(10,20);
        MyCalendar.book(15,25);
        MyCalendar.book(25,30);

        MyCalendar.book(50,60);
        MyCalendar.book(39,55);
        System.out.println(calendar);
    }
}

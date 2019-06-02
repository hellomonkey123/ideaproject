package com.algorithm.test;

import org.junit.Test;

import java.util.ArrayList;

public class LastRemaining_Solution {

    public int lastRemaining_Solution(int n, int m) {
        //if(n == 0) return
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(i);
        }
        int tmp = 0;
        for(int i = 0;i < n - 1; i++){
            tmp = (tmp + m - 1) >= list.size() ? (tmp + m - 1) % list.size() : (tmp + m - 1);
            list.remove(tmp);


        }
        return list.get(0);
    }

    @Test
    public void test(){
        System.out.println(lastRemaining_Solution(7,3));
    }
}

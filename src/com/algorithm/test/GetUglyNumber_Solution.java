package com.algorithm.test;

import org.junit.Test;

import java.util.ArrayList;


public class GetUglyNumber_Solution {
    public int getUglyNumber_Solution(int index) {
        if(index < 7) return index;
        ArrayList<Integer> list = new ArrayList<>();
        /*  这段代码算法复杂度太高了
        int count = 6;
        int tt = 8;
        while(count < index){
            int tmp = tt;
            if(IsUgly(tmp)) count++;
            tt++;
        }
        return tt - 1;

    }

    public boolean IsUgly(int tmp){
        while(tmp % 2 == 0 || tmp % 3 == 0 || tmp % 5 == 0){
            if(tmp % 2 == 0) tmp /= 2;
            if(tmp % 3 == 0) tmp /= 3;
            if(tmp % 5 == 0) tmp /= 5;
        }
        return tmp == 1 ? true : false;*/

        list.add(1);
        int t2 = 0, t3 = 0, t5 = 0;
        for(int count = 1; count < index; count++){
            list.add(Math.min(Math.min(list.get(t2)*2,list.get(t3)*3),list.get(t5)*5));
            if(list.get(count) == list.get(t2)*2) t2++;
            if(list.get(count) == list.get(t3)*3) t3++;
            if(list.get(count) == list.get(t5)*5) t5++;
        }
        return list.get(index -1);
    }

    @Test
    public void test(){
        int t = 8;
        System.out.println(getUglyNumber_Solution(t));
    }
}

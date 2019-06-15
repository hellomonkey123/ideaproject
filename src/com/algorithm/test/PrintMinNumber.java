package com.algorithm.test;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PrintMinNumber {

    public String printMinNumber(int[] nums){
        if(nums.length == 0) return "";
        String str = "";
        if(nums.length == 1) return str + nums[0];
        String[] list = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            list[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                String str1 = o1 + o2;
                String str2 = o2 + o1;
                return str1.compareTo(str2);
            }
        });

        for(int i = 0; i < nums.length; i++){
            str += list[i];
        }
        return str;
    }

    @Test
    public void test(){
        int[] nums = {3,30,32,321};
        System.out.println(printMinNumber(nums));
    }
}

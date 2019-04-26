package com.algorithm.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class IntToRoman {
    public String intToRoman(int num) {

        String s = "";
        //int[] s = {0, 1};
        // int i = 0;
        //int value = 1000;
        //s = count(num, 1000);
        List<List<int[]>> list = new ArrayList<>();
        List<int[]> list1 = new ArrayList<>();
        list1.add(new int[] {1,234,4});
        list.add(list1);

        String[] strs = {"sho","hkdh","hdjh"};
        strs[0].substring(0,0).equals(strs[1].substring(0,0));
        strs[0].length();
        if(num > 1000){
            for(int i = 0; i < num /1000; i++){
                s += "M";
            }
            num %= 1000;
        }
        if(num >= 100){
            if(num >= 500){
                if((num - 500) / 100 >= 3){
                    for(int i = 0; i < 5 - (num - 500) / 100; i++){
                        s += "C";
                    }
                    s += "M";
                }else{
                    s += "D";
                    for(int i = 0; i < (num - 500) / 100; i++){
                        s += "C";
                    }
                }
            }else{
                if(num / 100 >= 3){
                    for(int i = 0; i < 5 - num / 100; i++){
                        s += "C";
                    }
                    s += "D";
                }else{
                    for(int i = 0; i < num / 100; i++){
                        s += "C";
                    }
                }
            }
            num %= 100;
        }
        if(num >= 10){
            if(num >= 50){
                if((num - 50) / 10 >= 3){
                    for(int i = 0; i < 5 - (num - 50) / 10; i++){
                        s += "X";
                    }
                    s += "C";
                }else{
                    s += "L";
                    for(int i = 0; i < (num - 50) / 10; i++){
                        s += "X";
                    }
                }
            }else{
                if(num / 10 >= 3){
                    for(int i = 0; i < 5 - num / 10; i++){
                        s += "X";
                    }
                    s += "L";
                }else{
                    for(int i = 0; i < num / 10; i++){
                        s += "X";
                    }
                }
            }
            num %= 10;
        }
        if(num >= 1){
            if(num >= 5){
                if((num - 5)  >= 3){
                    for(int i = 0; i < 5 - (num - 5); i++){
                        s += "I";
                    }
                    s += "X";
                }else{
                    s += "V";
                    for(int i = 0; i < (num - 5); i++){
                        s += "I";
                    }
                }
            }else{
                if(num >= 3){
                    for(int i = 0; i < 5 - num ; i++){
                        s += "I";
                    }
                    s += "V";
                }else{
                    for(int i = 0; i < num ; i++){
                        s += "I";
                    }
                }
            }
        }
        return s;
    }

    @Test
    public void test(){
        System.out.println(intToRoman(178));
    }
}

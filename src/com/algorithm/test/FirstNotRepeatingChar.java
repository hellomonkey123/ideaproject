package com.algorithm.test;

import org.junit.Test;

import java.util.HashMap;

public class FirstNotRepeatingChar {
    public int firstNotRepeatingChar(String str){
        if(str.length() < 2) return str.length() - 1;
        HashMap map = new HashMap();
        for (int i = 0; i < str.length(); i++){
            map.put(i,str.charAt(i));
        }
        int tmp = -1;
        for (int i = 0; i < str.length(); i++){
            map.remove(i,str.charAt(i));
            if (!map.containsValue(str.charAt(i))) {
                tmp = i;
                break;
            }else{
                map.put(i,str.charAt(i));
            }
        }
        return tmp ;
    }

    @Test
    public void test(){
        String str = "zuDClOWjkPNhb";
        System.out.println(firstNotRepeatingChar(str));
    }
}

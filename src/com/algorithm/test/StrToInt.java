package com.algorithm.test;

import org.junit.Test;

public class StrToInt {
    public int strToInt(String str) {
        if(str.length() == 0) return 0;
        int tmp = 1, count = 0, i = 0;
        if(str.charAt(0) == '+')  i++;
        else if(str.charAt(0) == '-') {
            tmp = -1;
            i++;
        }
        while (i < str.length()){
            if(str.charAt(i) <= '9' && str.charAt(i) >= '0'){
                count = count * 10 + str.charAt(i) - '0';
                i++;
            }else
                return 0;
        }
        return tmp*count;
    }

    @Test
    public void test(){
        String str = "+123";
        System.out.println(strToInt(str));
    }
}

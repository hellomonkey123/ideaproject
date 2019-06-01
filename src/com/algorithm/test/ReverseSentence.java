package com.algorithm.test;

import org.junit.Test;

public class ReverseSentence {

    public String reverseSentence(String str) {

        int len = str.length();
        if(len < 2) return str;
        String tmp_str = "";

        int tmp = len;
        len--;
        while(len >= 0){
            if(str.charAt(len) == ' ') {
                tmp_str += (str.substring(len + 1,tmp) + " ");
                tmp = len;
            }else if(len == 0){
                tmp_str += str.substring(len,tmp);
            }
            len--;
        }
        return tmp_str;
    }

    @Test
    public void test(){
        String str = "student. a am I";
        System.out.println(reverseSentence(str));
    }
}

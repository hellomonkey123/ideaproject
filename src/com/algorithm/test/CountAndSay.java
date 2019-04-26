package com.algorithm.test;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountAndSay {

    public static String countAndSay(int n) {
        int tt = 2;
        List<String> list = new ArrayList<>();
        list.add("11");
        Math.ceil(1 / 2);
        if(n == 1)
            return "1";
        else if(n == 2){
            return "11";
        }else{
            while(tt <= n){
                list.add(readString(list.get(tt-2)));
                tt++;
            }
            return list.get(n-2);
        }
    }

    public static String readString(String s){
        char[]  ch = s.toCharArray();
         s = "";
         StringBuffer q = new StringBuffer("yruwy");
        int i = 0;
        int j = 1;
        while(i < ch.length - 1){

            if(ch[i] == ch[i + 1]){
                j++;
            }else {
                s = s + j + ch[i];
                j = 1;
                //s = s + j + ch[i + 1];
            }
            if (i == ch.length - 2){
                s = s + j + ch[i +1];
            }
            i++;
        }
        return s;
    }

    public static void main(String[] args){

        System.out.println(countAndSay(6));
    }
}

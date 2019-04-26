package com.algorithm.test;

import org.junit.Test;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        String tt = strs[0].substring(0, 1);
        if(strs.length == 0)
            return "";
        if(strs.length == 1)
            return strs[0];
        String tmp = "";
        int i = 0;
        int size_String = strs[0].length();
        while(i < strs.length){
            if(size_String > strs[i].length())
                size_String = strs[i].length();
            i++;
        }
        if(size_String == 0)
            return "";
        else {
            for (int j = 0; j < size_String; j++) {
                int t = strs.length - 1;
                while (t > 0 && strs[t].substring(0, j + 1).equals(strs[t - 1].substring(0, j + 1))) {
                    t--;
                }
                if (t != 0) {
                    if (j != 0)
                        tmp = strs[0].substring(0, j - 1);
                    break;
                }
                tmp = strs[0].substring(0, size_String);
            }

        }

        return tmp;
    }

    @Test
    public void tesst(){
        String[] str = {"a","b"};
        System.out.println(longestCommonPrefix(str));
    }
}

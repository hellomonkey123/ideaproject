package com.algorithm.test;

import org.junit.Test;

public class NumberOfLines {

    public int[] numberOfLines(int[] widths, String S) {

        int count = 0;
        int tmp  = 0;
        for(int i = 0; i < S.length() - 1; i++){
            count += widths[S.charAt(i) - 'a'];
            if(count == 100){
                count = 0;
                tmp++;
            }else if(count + widths[S.charAt(i + 1) - 'a'] > 100){
                tmp++;
                count = 0;
            }
        }
        count += widths[S.charAt(S.length() - 1) - 'a'];
        return new int[] {tmp + 1, count};
    }

    @Test
    public void test(){
        String s = "abcdefghijklmnopqrstuvwxyz";
        int[] num = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        int[] tmp = numberOfLines(num,s);
        for (int i = 0; i < tmp.length; i++){
            System.out.println(tmp[i]);
        }

    }
}

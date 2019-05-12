package com.algorithm.test;

import org.junit.Test;

public class ShortestToChar {

    public int[] shortestToChar(String S, char C) {

        int[] minDistence = new int[S.length()];

        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == C){
                minDistence[i] = 0;
            }else
                minDistence[i] = -1;
        }
        int tmp = -1;
        for(int i = 0; i < S.length(); i++){
            if(minDistence[i] == 0)
                tmp = 0;
            else if(tmp <= 0){
                tmp++;
                minDistence[i] += tmp;
            }
        }
        tmp = -1;
        int[] minDistence_tmp = minDistence;
        for(int i = S.length() - 1; i >= 0; i--){
            if(minDistence_tmp[i] == 0)
                tmp = 0;
            else if(tmp <= 0){
                tmp++;
                minDistence_tmp[i] += tmp;
            }
        }
        for(int i = 0; i < S.length(); i++){
            minDistence[i] = (minDistence[i] < 0 || minDistence[i] > minDistence_tmp[i]) ? minDistence_tmp[i] : minDistence[i];
        }
        return minDistence;
    }

    @Test
    public void test(){
        String s = "loveleetcode";
        int[] tmp = shortestToChar(s,'e');
        for (int i = 0; i < tmp.length; i++){
            System.out.print(tmp[i] + " ");
        }

    }
}

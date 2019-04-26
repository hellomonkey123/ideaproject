package com.algorithm.test;

import org.junit.Test;

import java.util.Scanner;

public class StrCut {

    @Test
    public static void strCut(String[] s){
        for(int i = 0; i < 2; i++){
            int j = s[i].length() % 8 == 0 ? 0 : (8 - s[i].length() % 8);
            for (int tt = 0; tt < j; tt++){
                s[i] = s[i] + 0;
            }
            int jj = s[i].length() / 8;
            String[] tmp = new String[jj];
            while (jj > 0){
                jj--;
                tmp[jj] = s[i].substring(jj * 8, (jj+1)* 8);
            }
            for (int q = 0; q < tmp.length; q++){
                System.out.println(tmp[q]);
            }
        }
    }

    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        String[] s = new String[2];
        for(int i = 0; i < 2; i++){
            s[i] = input.next();
        }
        strCut(s);
    }
}

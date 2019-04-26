package com.algorithm.test;

import java.util.Scanner;

public class InvertIntNum {

    public static void invertIntNum(int num){
        int a = num;
        String s = "";
        while (a % 10 == 0) {
            a = a / 10;
        }
        while(a >= 10){
            s = s + a % 10;
            a = a / 10;
        }
        s = s + a;
        System.out.print(num + " ");
        System.out.println(s);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i = 0;
        int[] a = new int[10];
        while(i < 9){
            StringBuffer c = new StringBuffer();
            int t = input.nextInt();
            if (t == 0) break;
            c.append(t);
            invertIntNum(a[i]);
            i++;
        }
    }
}

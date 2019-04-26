package com.algorithm.test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class ReverseInt {
    public static int reverse(String str) {

        if (str.equals(""))
            return 0;
        int rev = 0;
        char[] x = str.toCharArray();
        int[] y = {1,2,6,4};
        sort(y);
        int i = 0;
        while (x[i] == ' ') {
            if (i == x.length-1)
                return 0;
            i++;
        }
        if(x[i] == '-'){
            if (x.length - i == 1)
                return 0;
            i++;
            while(x[i] >= '0' && x[i] <= '9' && x.length > i + 1){
                rev = rev * 10 + x[i] - '0';
                i++;
                if(rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && x[i] > '7')){
                    return -2147483648;
                }
            }

            if (x[i] >= '0' && x[i] <= '9')
                return  -rev * 10 - x[i] + '0';
            else
                return -rev;
        }else if (x[i] == '+'|| (x[i] >= '0' && x[i] <= '9')){
            if (x[i] >= '0' && x[i] <= '9')
                rev = x[i] - '0';
            if (x.length - i == 1)
                return rev;
            i++;
            while (x[i] >= '0' && x[i] <= '9' && x.length > i + 1) {
                rev = rev * 10 + x[i] - '0';
                i++;
                if (rev > Integer.MAX_VALUE / 10 || ((rev == Integer.MAX_VALUE / 10) && x[i] > '6')) {
                    return 2147483647;
                }
            }
            if (x[i] >= '0' && x[i] <= '9')
                return  rev * 10 + x[i] - '0';
            else
                return rev;
        }else {
            return 0;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String x = input.next();
//        String x = "-2147483641";
        System.out.println(reverse(x));
    }
}

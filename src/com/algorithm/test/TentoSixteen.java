package com.algorithm.test;

import org.junit.Test;

import java.util.Scanner;

public class TentoSixteen {


    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        String v = input.next();
        String s = input.next();
        if (s.length() < 3){
            System.out.print("Input Error");
        }else {
            tentoSixteen(s.substring(2,s.length()));
        }

    }

    @Test
    private static void tentoSixteen(String str) {
        int sum = 0;
        char[] string = str.toCharArray();
        for (int i = 0; i < string.length; i++){
            if (string[i] >= 'A' && string[i] <= 'F') {
                sum += (string[i] - 'A' + 10) * Math.pow(16, string.length - i - 1);
            }else if(string[i] >= 'a' && string[i] <= 'f'){
                sum += (string[i] - 'a' + 10) * Math.pow(16, string.length - i - 1);
            }else {
                sum += (string[i] - '0' + 10) * Math.pow(16, string.length - i - 1);
            }
        }
        System.out.print(sum);
    }
}

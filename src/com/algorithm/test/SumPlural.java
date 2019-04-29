package com.algorithm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.abs;


@RunWith(JUnit4.class)
class SumPlural {

    @Test
    public static void sumPlural(int[][] a, int n){
        for (int i = 0; i < n; i++){
            if ((a[i][1]+a[i][3]) > 0) {
                System.out.println((a[i][0] + a[i][2]) + "+" + (a[i][1] + a[i][3]) + "i");
            }else {
                System.out.println((a[i][0] + a[i][2]) + "-" + abs(a[i][1] + a[i][3]) + "i");
            }
        }
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[][] a = new int[n][4];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 4; j++){
                a[i][j] = input.nextInt();
            }
        }
        sumPlural(a,n);
    }
}

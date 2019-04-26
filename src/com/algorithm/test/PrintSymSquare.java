package com.algorithm.test;

import java.util.Scanner;

public class PrintSymSquare {


    public static void printSymSquare(int squ){

        String q = Integer.toString(squ);
        char[] a = q.toCharArray();
        int i = 0;
        while(i <= a.length / 2){
            if(a[i] != a[a.length -(1 + i)]){
                break;
            }
            i++;
        }
        if (i == a.length / 2 + 1){
            System.out.print(squ + " ");
        }
    }

    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int num = src.nextInt();
        if (num < 1 || num > 256){
            System.out.print("无");
        }

        for (int j = 1; j <= num; j++){
            if (j == 1){
                System.out.print( "1 ");
            }else if (j == 2){
                System.out.print( "4 ");
            }else if (j == 3){
                System.out.print("9 ");
            }else {
                printSymSquare(j*j);
            }
        }
    }
}

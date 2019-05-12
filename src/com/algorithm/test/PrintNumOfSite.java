package com.algorithm.test;

import java.util.*;

public class PrintNumOfSite {

    public static void printNumOfSite(int n, String[] a){

        for (int i = 0; i < n; i++){
            char[] ch = a[i].toCharArray();
            int j = 0;
            while (j < ch.length){
                if (ch[j] >= '0' && ch[j] <= '9')
                    System.out.print((j + 1) + " ");
                j++;
            }
        }
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String[]  a = new String[n];

        for (int i = 0; i < n; i++){
            a[i] = input.nextLine();
        }
        String sss = a[1].substring(0,4);
        printNumOfSite(n,a);
        for (int i = 0; i < n; i++){
            System.out.println(a.length);
            System.out.println(a[i]);
        }
    }
}

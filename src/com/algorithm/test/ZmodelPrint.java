package com.algorithm.test;

import java.util.Scanner;

public class ZmodelPrint {

    public static void zmodelPrint(String str, int num){

        char[] chars = str.toCharArray();
        if(num == 1 || str.length() < num){
            System.out.print(str);
        }
        for (int i = 0; i < num; i++){
            for (int j = 0; 2 * j * (num - 1)< chars.length; j++){
                if (i == 0){
                    System.out.print(chars[2 * j * (num - 1)]);
                }else if (j == 0){
                    System.out.print(chars[i]);
                }else if (i == num - 1 && (2 * j + 1)* (num - 1) <chars.length) {
                    System.out.print(chars[(2 * j + 1) * (num - 1)]);
                }else if(chars.length >= num && chars.length <= 2*(num - 1) && i != num -1){
                    if(2*(num - 1) - i < chars.length)
                        System.out.print(chars[2*(num - 1) - i]);
                }else if (2 * (j + 1)* (num - 1) < chars.length){
                    System.out.print(chars[2 * j * (num - 1) - i]);
                    System.out.print(chars[2 * j * (num - 1) + i]);
                }else if ((2 * j + 1)* (num - 1)  >= chars.length - 1 && 2 * j * (num - 1) + i < chars.length){
                    System.out.print(chars[2 * j * (num - 1) - i]);
                    System.out.print(chars[2 * j * (num - 1) + i]);
                }else if ((2 * j + 1)* (num - 1)  < chars.length && 2 * (j + 1)* (num - 1) >= chars.length){
                    System.out.print(chars[2 * j * (num - 1) - i]);
                    System.out.print(chars[2 * j * (num - 1) + i]);
                    if (2 * (j + 1)* (num - 1) - i < chars.length) {
                        System.out.print(chars[2 * (j + 1) * (num - 1) - i]);
                    }

                }
            }
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        int num = input.nextInt();
        zmodelPrint(str, num);
    }
}

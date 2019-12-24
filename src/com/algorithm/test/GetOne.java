package com.algorithm.test;


import java.util.Scanner;

/**
 * @program: GetOne
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/12
 */
public class GetOne {

    public static int getOne(long num){
        int count = 0;
        if(num <= 1) return 0;
        else if (num < 4) return (int) (num -1);
        while(num > 1){
            if (Math.sqrt(num)- Math.floor(Math.sqrt(num)) == 0) num = (long) Math.sqrt(num);
            else {
                count += (num - Math.pow(Math.floor(Math.sqrt(num)),2) - 1) ;
                num = (long) Math.pow(Math.floor(Math.sqrt(num)), 2);

            }
            count++;
        }


        return count;
    }
    public static int getOne1(long num){
        int count = 0;
        if(num <= 1) return 0;
        else if (num < 4) return (int) (num -1);
        while(num > 1){
            if (Math.sqrt(num)- Math.floor(Math.sqrt(num)) == 0) num = (long) Math.sqrt(num);
            else {
                num--;
            }
            count++;
        }

        return count;
    }

    public static void main(String[] str){
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        System.out.println(getOne(num));
        System.out.println(getOne1(num));
    }
}

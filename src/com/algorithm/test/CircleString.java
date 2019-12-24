package com.algorithm.test;

import java.util.Scanner;

/**
 * @program: CircleString
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/28
 */
public class CircleString {
    private  static boolean ff = false;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strs = str.split(" ") ;
        if(strs == null || strs.length < 1) System.out.println(ff);
        build(strs, 0);
        System.out.println(ff);
    }


    public static void build(String[] strs, int num){
        if(num == strs.length){
            ff = true;
            return;
        }
        for(int i = num; i < strs.length; i++){
            if(num > 0 && isEqueue(strs[num - 1], strs[i])){
                swap(strs, num, i);
                build(strs, num + 1);
                swap(strs, num, i);
            }else if(num == 0){
                swap(strs, num, i);
                build(strs, num + 1);
                swap(strs, num, i);
            }
        }
    }

    public static void swap(String[] strs, int index1, int index2){
        String tmp = strs[index1];
        strs[index1] = strs[index2];
        strs[index2] =tmp;
    }

    public static boolean isEqueue(String str1, String str2){
        return str1.charAt(str1.length() - 1) == str2.charAt(0);
    }
}

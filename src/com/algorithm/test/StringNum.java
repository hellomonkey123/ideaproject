package com.algorithm.test;

import java.util.Scanner;

/**
 * @program: StringNum
 * @description:
 * @author: liu yuanwen
 * @create: 2019/8/7
 */
public class StringNum {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String[] strs = str.split("@");

        String[] totals = strs[0].split(",");
        String[] used = strs[1].split(",");
        StringBuilder[] strBuilder = new StringBuilder[totals.length];
        for (int i = 0; i < totals.length; i++)
            strBuilder[i] = new StringBuilder(totals[i]);
        for (int i = 0; i < totals.length; i++){
            for (int j = 0; j < used.length; j++)
                if (totals[i].charAt(0) == used[j].charAt(0)){
                    int tmp = (totals[i].charAt(2) - used[j].charAt(2));
                    char dn = (char) (tmp + 48); //对应ASCAII码
                    strBuilder[i].setCharAt(2, dn);
                    break;
                }
        }
        for (StringBuilder ss : strBuilder)
            if (ss.charAt(2) != '0')
                System.out.print(ss.toString()+",");
    }
}

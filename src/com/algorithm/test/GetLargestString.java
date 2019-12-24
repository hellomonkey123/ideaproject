package com.algorithm.test;

import java.util.AbstractQueue;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @program: GetLargestString
 * @description:
 * @author: liu yuanwen
 * @create: 2019/8/11
 */
public class GetLargestString {

    public static void mian(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String[] strs = new String[num];
        int[] output = new int[num];
        for (int i = 0; i < num; i++){
            strs[i] = in.next();
        }

        for (int i = 0; i < num; i++){
            int count = 0;
            for(int j = 0; j < strs[i].length(); j++){
                if (strs[i].charAt(j) != 'N') count++;

            }
        }
    }
}

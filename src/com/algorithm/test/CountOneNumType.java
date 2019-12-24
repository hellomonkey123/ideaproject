package com.algorithm.test;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @program: CountOneNumType
 * @description:
 * @author: liu yuanwen
 * @create: 2019/8/11
 */
public class CountOneNumType {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        int aa = in.nextInt();
        int[] output = new int[aa];
        for(int i = 0; i < aa; i++) {
            int num = in.nextInt();
            int[] arr = new int[num];
            for (int j = 0; j < num; j++) {
                arr[j] = in.nextInt();
            }

            HashSet<Integer> set = new HashSet<>();
            for (int ss : arr) {
                int count = 0;
                while (ss > 0) {
                    count += ss & 1;
                    ss /= 2;
                }
                set.add(count);
            }
            output[i] = set.size();
        }
        //StringBuffer str = new StringBuffer();
        for (int ss : output)
            System.out.println(ss);
    }
}

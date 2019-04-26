package com.algorithm.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestSum {

    public static int largestSum(int[] ints){
        int i = 0;
        while(i < ints.length - 1){
            if (ints[i] >= ints[i + 1])
                i++;
            else
                break;
        }
        if (i == ints.length - 1)
            return 0;
        int j = i;
        /*while(i < ints.length - 1){
            if (ints[j] <= ints[i + 1])
                i++;
        }
        if (i == ints.length - 1)
            return ints[ints.length - 1] - ints[0];
        else
            i = 0;*/
        List<int[]> list = new ArrayList<>();
        int[] ss = new int[0];

        while(j + i < ints.length - 1){

            if (ints[j + i] <= ints[j + i + 1] ){
                i++;
                if (j + i < ints.length - 1)
                    continue;
            }
            ss = new int[1 + i];
            for(int sss = 0; sss <= i; sss++){
                ss[sss] = ints[j + sss];
            }
            if ( j + i == ints.length-1){
                list.add(ss);
            }else if (ints[j + i] > ints[j + i + 1]){
                list.add(ss);
                j = j + i + 1;
                i = 0;
            }
        }
        if (list.size() == 1){
            return list.get(0)[list.get(0).length -1] - list.get(0)[0];
        }
        if(list.size() == 2) {
            return list.get(0)[list.get(0).length - 1] - list.get(0)[0] + list.get(1)[list.get(1).length - 1] - list.get(1)[0];
        }
        if(list.size() > 2){
            int sum = 0;
            int[] qq = new int[list.size()];
            for (int tt = 0; tt < list.size();tt++){

            }
            return 0;
        }
        return 0;
    }

    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        int[] ints = input.nextBigInteger();
        String s = "jcksj";
        s = s + 23 + 1;
        System.out.println(s);
        int[] ints = {1, 2, 3, 2, 4, 2, 4};
        System.out.println(largestSum(ints));

    }
}

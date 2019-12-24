package com.algorithm.test;

import java.util.Arrays;

/**
 * @program: SortUnderK
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/17
 */
public class SortUnderK {

    public int SortUnderK(int[] aa, int[] people){

        Arrays.sort(people);
        if (aa[0] == 1) return 1;
        else if (aa[0] == 2) return people[1] - people[0] >= aa[1] ? 0 : 1;
        for (int i = 0; i < aa[0] - 1; i++){
            if (people[i + 1] >= aa[1]) return 0;
        }
        int[] tmp = new int[aa[0]];
        int i = 0;
        while( i < aa[0] - 2){
            int j = i + 2;
            while (people[j] - people[i] < aa[1]) j++;

            if(i == 0 && j == aa[0] - 1) return j *(j + 1)/2;
            tmp[i] = j;
            i = j;
        }
        return 0;
    }
}

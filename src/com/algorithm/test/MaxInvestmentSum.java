package com.algorithm.test;

import org.junit.Test;

/**
 * @program: MaxInvestmentSum
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/11
 */
public class MaxInvestmentSum {

    public int MaxInvestmentSum(int[] num){
        int MaxSum = 0;
        int i = 0, j = 0;
        while (i < num.length - 1){
            if (num[i + 1] < num[i]){
                MaxSum += (i > j ? (num[i] - num[j]) : 0);
                j = i + 1;
            }
            i++;
        }
        return MaxSum;
    }

    @Test
    public void test(){
        int[] num = {7,3,2,4,9,8,3,2,11,9,9,10,5};
        System.out.println(MaxInvestmentSum(num));
    }
}

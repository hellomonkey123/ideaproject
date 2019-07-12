package com.algorithm.test;

import org.junit.Test;

/**
 * @program: MaxContinueSum
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/11
 */
public class MaxContinueSum {

    //线性规划的问题，找到连续最大和
    public int maxContinueSum(int[] num){
        int[] tmp = new int[num.length];
        int maxSum = 0;
        if (num[0] > 0)
            tmp[0] = num[0];
        else
            tmp[0] = 0;
        for (int i = 1; i < num.length; i++){
            if (tmp[i - 1] + num[i] > 0)
                tmp[i] = tmp[i - 1] + num[i];
            else
                tmp[i] = 0;

            maxSum = maxSum > tmp[i] ? maxSum : tmp[i];
        }
        return maxSum;
    }

    @Test
    public void test(){
        int[] num = {3,-2 ,11, -4, 13, -5, 3};
        System.out.println(maxContinueSum(num));
    }
}

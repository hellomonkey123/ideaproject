package com.algorithm.test;

/**
 * @program: GetMaxSum
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/17
 */
public class GetMaxSum {

    public int getMaxSum(int k, int[] num){
        int sum = 0;
        if (k <= 2) {
            for (int s : num)
                sum += s;
            return sum;
        }


        return 0;

    }
}

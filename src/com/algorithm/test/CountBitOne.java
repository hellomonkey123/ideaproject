package com.algorithm.test;

import org.junit.Test;

/**
 * @program: CountBitOne
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/30
 */
public class CountBitOne {

    public int countOne(int num){
        int count = 1;
        while (num > 1) {
            int tmp = num--;
            while (tmp > 0) {
                count += (tmp & 1);
                tmp /= 2;
            }
        }
        return count;
    }
    @Test
    public void test(){
        System.out.println(countOne(10000));
    }
}

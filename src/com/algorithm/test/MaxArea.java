package com.algorithm.test;

import org.junit.Test;

public class MaxArea {

    public int maxArea(int[] height) {

        int max = 0;
        for(int i = 0; i < height.length - 1; i++){
            for(int j = i + 1; j < height.length; j++){
                int tmp = (height[i] < height[j] ? height[i] : height[j])*(j - i);
                max = max < tmp ? tmp : max;
            }
        }
        return max;
    }

    @Test
    public void test(){
        int[] i = {2,3,4,5,18,17,6};
        System.out.println(maxArea(i));
    }
}

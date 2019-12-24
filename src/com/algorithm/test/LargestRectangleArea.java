package com.algorithm.test;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: LargestRectangleArea
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/27
 */
public class LargestRectangleArea {

    public int maxArea(int[] height){

        int[] heightNum = new int[height.length + 1];
        for (int i = 0; i < height.length; i++){
            heightNum[i] = height[i];
        }
        Deque<Integer> stack = new ArrayDeque<>();
        int maxArea = 0;
        for (int i = 0; i < heightNum.length; i++){
            while (!stack.isEmpty() && heightNum[i] < heightNum[stack.peek()]){
                int tmp = stack.pop();
                maxArea = Math.max(height[tmp] * (stack.isEmpty() ? i : (i - stack.peek() -1)),maxArea);
            }
            stack.push(i);
        }
        return maxArea;
    }

    @Test
    public void test(){
        int[] num = {1,2,4,6,3,2,3,7,1};
        System.out.println(maxArea(num));
        String str = "dkjls jfljfl";
        String[] hdk = str.split(" ");
        for (String ss : hdk)
            System.out.println(ss);

    }
}

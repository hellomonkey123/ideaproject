package com.algorithm.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Stack;

public class IsPopOrder {
    public boolean isPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> list1 = new Stack<>();

        int popIndex = 0; //记录当前出栈位置
        for(int i = 0; i < pushA.length; i++){
            list1.push(pushA[i]);
            //栈顶与当前出栈位置值相等时弹出，否则，继续入栈
            while (!list1.empty() && list1.peek() == popA[popIndex]){
                list1.pop();
                popIndex++;
            }
        }
        return list1.empty();
    }

    @Test
    public void test(){
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,3,5,1,2};
        System.out.println(isPopOrder(pushA,popA));
    }
}

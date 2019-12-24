package com.algorithm.test;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

public class IsContinuous {
    public boolean isContinuous(int [] numbers) {
        //最笨的穷举
        if(numbers.length == 0) return false;
        Arrays.sort(numbers);
        int i = numbers.length - 1;
        if(numbers[3] == 0) return true;
        else if(numbers[2] == 0) return numbers[4] - numbers[3] <= 4 && numbers[4] != numbers[3];
        else{
            int count1 = 0;
            int count2 = 0;
            while(i > 1){
                if(numbers[i] - numbers[i - 1] == 1) {
                    i--;
                }
                else if(numbers[i] - numbers[i - 1] == 2) {
                    count1++;
                    i--;
                }else if(numbers[i] - numbers[i - 1] == 3){
                    count2++;
                    i--;
                }
                else return false;
            }
            if(numbers[1] != 0 && numbers[0] == 0)
                return count1 <= 1 && count2 == 0;
            else if(numbers[1] == 0){
                return (count1 <= 2 && count2 == 0) || (count2 == 1 && count1 == 0);
            }else{
                return count1 == 0 && count2 == 0;
            }
        }
    }

    @Test
    public void test(){

        int[] num = {0,0,1,4,5};
        System.out.println(isContinuous(num));
    }
}

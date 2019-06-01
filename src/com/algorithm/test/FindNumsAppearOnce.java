package com.algorithm.test;

import org.junit.Test;

import java.util.Arrays;

public class FindNumsAppearOnce {

    public void findNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Arrays.sort(array);
        int i = 0;
        while( i < array.length){
            if(i < array.length -1 && array[i] == array[i + 1]) i += 2;
            /*if(array[i] != array[i + 1] && num1[0] == 0) {
                num1[0] = array[i];
                i++;
            }*/
            if(i == array.length - 1 || array[i] != array[i + 1] ){
                if (num1[0] == 0) {
                    num1[0] = array[i];
                    i++;
                }else {
                    num2[0] = array[i];
                    break;
                }
            }
        }
        System.out.println(num1[0] + " " + num2[0]);

    }

    @Test
    public void test(){
        int[] arr = {4,6,1,1,1,1};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        findNumsAppearOnce(arr,num1,num2);
    }
}

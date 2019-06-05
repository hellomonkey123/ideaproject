package com.algorithm.test;

import org.junit.Test;

public class Multiply {
    public int[] multiply(int[] A) {
        if(A.length < 2) return A;
        int[] left = new int[A.length];
        int[] right = new int[A.length];
        left[0] = 1;
        right[A.length - 1] = 1;
        for(int i = 1; i < A.length; i++){
            left[i] = left[i - 1]* A[i - 1];
        }
        for(int i = A.length - 2; i >= 0; i--){
            right[i] = right[i + 1]*A[i+ 1];
        }
        for(int i = 0; i < A.length; i++){
            A[i] = left[i]*right[i];
        }
        return A;
    }

    @Test
    public void test(){
        int[] num = {1,2,3,4,5};
        System.out.println(multiply(num));
    }
}

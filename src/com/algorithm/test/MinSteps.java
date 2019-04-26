package com.algorithm.test;

import org.junit.Test;

public class MinSteps {

    public int minSteps(int n) {

        int count = 0;
        if(n == 1){
            return 0;
        }
        if(n < 6 && n >= 2){
            return n;
        }
        int[] x = new int[2];
        x = findLast(n);
        if(x[0] == n){
            return n;
        }
        count += x[1];
        while(x[0] > 2 && x[0] != findLast(x[0])[0]){
            x = findLast(x[0]);
            count += x[1];
        }

        return count + x[0];

    }

    public int[] findLast(int num){
        int tmp = 0;
        for(int i = num / 2; i > 1; i++){
            if(num % i == 0){
                tmp = i;
                break;
            }
        }
        if(tmp == 0){
            return new int[] {num,num};
        }else{
            return new int[] {tmp,num/tmp};
        }
    }

    @Test
    public void test(){
        minSteps(9);
    }
}

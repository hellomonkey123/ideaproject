package com.algorithm.test;

import org.junit.Test;

public class NumberOf1Between1AndN_Solution {

    public int numberOf1Between1AndN_Solution(int n) {
        int sum = 0;
        if(n < 10) return 1;
        /*
        int tt = n >= 100 ? n % 100 : n;
        if(tt / 10 == 1){
            sum += (tt % 10 == 0 ? 2 : (tt % 10 + 3));
        }else if(tt / 10 == 0){
            sum += 1 + tt / 10;
        }else{
            sum += ((tt % 10 >= 1 ? tt / 10 + 1 : tt /10) + 10);
        }
        while(n /)
        return sum +  n / 100 * 20;
        */
        int tmp = 0, i = 0;
        if(n % 10 <= 1) sum++;
        while(n > 0){
            //if(n % 10 == 0) sum += 1;
            if(n % 10 == 1) {
                if (i <= 1)
                    sum += (tmp + 1 );
                else
                    sum += tmp;
            }else if(n % 10 > 1){
                if (i == 1) {
                    sum += (Math.pow(10, i) + tmp);
                }else
                    sum += Math.pow(10, i);
            }
            if(i == 2) sum += 2*n * Math.pow(10,i - 1);
            if(i > 2) sum += n * Math.pow(10,i - 1);
            tmp += (n % 10)*Math.pow(10,i);
            n /= 10;
            i++;
        }
        return sum;
    }

    @Test
    public void test(){
        System.out.println(numberOf1Between1AndN_Solution(10000));
    }
}

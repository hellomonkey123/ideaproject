package com.algorithm.test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class BeautifulArray {

    public int[] beautifulArray(int N) {
        int m=N-1;
        int k=1;
        while(m!=1){
            m /= 2;
            k *= 2;
        }

        int[] tmp = new int[N];
        tmp[0] = 1;
        int j = 1,t =1;
        while(j < N){
            for(int i = 0; i < t; i++){
                if(tmp[i] + k <= N){
                    tmp[j] = tmp[i] + k;
                    j++;
                }
            }
            t = j;
            k /= 2;
        }
        return tmp;
    }

    @Test
    public void test(){
        int[] ss = {1,2,3,4,5,6,6};
        Map map = new HashMap();

        System.out.println(beautifulArray(7));
    }
}

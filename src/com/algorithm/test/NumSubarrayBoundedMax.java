package com.algorithm.test;

import org.junit.Test;

public class NumSubarrayBoundedMax {

    public int numSubarrayBoundedMax(int[] A, int L, int R) {

        int count = 0;
        int j = 0;
        while(j < A.length ){
            if(A[j] > R){
                j++;
            }else{
                int tmp = j;
                int count_tmp = 0, count_tmp1 = 0;
                int ss = 0;
                for(int i = tmp; i < A.length; i++){

                    if(A[i] > R){
                        j = i;
                        break;
                    }else if(i == A.length -1){
                        count_tmp++;
                        j = i + 1;
                    }else
                        count_tmp++;
                }
                for(int i = tmp; i < j; i++){
                    if(A[i] < L){
                        ss++;
                    }else{
                        count_tmp1 += (ss*(ss + 1)/2);
                        ss = 0;
                        tmp = i + 1;
                    }
                    if(ss == count_tmp || ss + tmp == j)
                        count_tmp1 += (ss*(ss + 1)/2);
                }
                count += (count_tmp * (count_tmp + 1)/2 - count_tmp1);
                j++;
            }
        }
        return count;
    }

    @Test
    public void test(){
        int[] a = {427,277,795,647,735,752,185,896,459,261,632,868,337,595,529,168,469,590,606,578,19,403,575,892,691,725,127,761,119,366,616,403,983,433,155,173,899,247,654,154,366,749,474,312,95,619,796,701,451,328,520,564,55,529,769,74,768,693,639,442,400,617,851,245,419,862,821,103,663,799,349,785,920,662,318,418,668,959,671,684,209,879,194,70,122,662,667,622,558,288,505,63,304,977,809,84,853,611,865,96};
        System.out.println(numSubarrayBoundedMax(a,377,772));

        String s = "hdjhk";
        System.out.println(s.charAt(4));
    }
}

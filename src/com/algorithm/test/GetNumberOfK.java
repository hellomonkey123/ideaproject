package com.algorithm.test;

import org.junit.Test;

public class GetNumberOfK {

    public int getNumberOfK(int [] array , int k) {

        int start = 0;
        int end = array.length - 1;
        if(array[start] > k || array[end] < k) return 0;
        int count = 0,tmp = -1,mid = 0;
        while(start <= end){
            mid = (start + end)/2;
            if(array[mid] < k) start = mid + 1;
            if(array[mid] > k) end = mid - 1;
            if(array[mid] == k) {
                tmp = mid;
                break;
            }
        }
        if(tmp == -1) return 0;
        while(tmp >= start){
            if(array[tmp--] == k) count++;
            else break;
        }
        while(mid <= end){
            if(array[mid++] == k) count++;
            else break;
        }
        return count -1;
    }

    @Test
    public void test(){
        int[] arr = { 4,4,4,4,4,4,4,6,8,9};
        System.out.println(getNumberOfK(arr,5));
    }
}

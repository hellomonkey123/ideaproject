package com.algorithm.test;

import org.junit.Test;

import java.util.Arrays;

public class MoreThanHalfNum_Solution {

    public int moreThanHalfNum_Solution(int [] array) {
        if(array == null) return 0;
        else if(array.length == 1) return array[0];
        /*
        HashMap map = new HashMap();
        for(int i = 0; i < array.length; i++){
            HashMap(array[i],i);
        }
        int count = 1,tmp = 1;
        int i = 0;
        while(i < array.length){
            int tt = array[]
            map.remove(array[i]);
            if(map.containsKey(array[i]))
                tmp++;
        }
        */
        Arrays.sort(array);
        int i = 0,count = 1,num = 0;
        while(i < array.length - 1){
            if(array[i] == array[i + 1]) {
                count++;
                num = array[i];
            }
            else if(array[i] != array[i + 1]){
                if(count > array.length/2 || i > array.length/2) break;
                else num = 0;
                count = 1;
            }
            i++;
        }
        return count > array.length/2 ? num : 0;
    }

    @Test
    public void test(){
        int[] num = {4,2,1,4,2,4,4};
        System.out.println(moreThanHalfNum_Solution(num));
    }
}

/**
 *
 */


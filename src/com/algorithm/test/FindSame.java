package com.algorithm.test;

import java.util.HashMap;
import java.util.Map;

public class FindSame {

    public static int[] findSum(int[] nums,int sum){

        Map<Integer, Integer> map = new  HashMap<>();

        int[] result = new int[5];
        int j = 0;
        for(int i=0;i<nums.length; i++) {
            map.put(nums[i], i);
        }
        for(int i=0;i<nums.length-1; i++){

            int lall = sum - nums[i];

            if(map.containsKey(lall)){
                result[j] = i;

                result[j+1] = (lall==nums[i]) ? ((map.get(lall) != i) ? map.get(lall):0):map.get(lall);

                j++;
            }
        }
        return result;
    }
    public static void main(String[] args){

        int[] a = {1,1,6,6,7};
        int sum = 12;
        int[] aa = findSum(a,sum);
        for(int i: aa){
            System.out.print(i + "  ");
        }
    }

}



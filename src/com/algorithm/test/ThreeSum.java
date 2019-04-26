package com.algorithm.test;

import org.junit.Test;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> Llist = new LinkedList<>();
        List<List<Integer>> newLlist = new LinkedList<>();
        Set set = new  HashSet();
        for(int i = 0; i < nums.length -2; i++){
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                int tmp = nums[i] + nums[left] + nums[right];
                if(tmp == 0){
                    Llist.add(new LinkedList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    left += 1;
                    right -= 1;
                }else if(tmp < 0){
                    left += 1;
                }else{
                    right -= 1;
                }
            }
        }
        for (List list : Llist){
            if (set.add(list)){
                newLlist.add(list);
            }
        }
        return newLlist;
    }

    @Test
    public void test(){
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}

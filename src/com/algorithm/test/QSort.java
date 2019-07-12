package com.algorithm.test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import static oracle.jrockit.jfr.events.Bits.swap;

/**
 * @program: QSort
 * @description:
 * @author: liu yuanwen
 * @create: 2019/6/25
 */
public class QSort {


    public void quickSort(int[] nums){
        if (nums.length > 0)
            sort(nums, 0, nums.length - 1);
        for (int num : nums)
        System.out.print(" "+ num);
    }

    public void sort(int[] nums, int findex, int lindex){
        if (findex > lindex) return;
        int j = partition(nums, findex, lindex);
        sort(nums, findex, j - 1);
        sort(nums, j + 1, lindex);
    }

    private int partition(int[] nums, int findex, int lindex) {
        int mid = findex + (lindex - findex) / 2;

       /* if (nums[mid] > nums[lindex]) swap(nums[mid],nums[lindex]);
        if (nums[mid] > nums[findex]) swap(nums[mid], nums[findex]);
        if (nums[findex] > nums[lindex]) swap(nums[findex], nums[lindex]);*/

        int tmp = nums[findex];
        while (findex < lindex){
            while (nums[lindex] >= tmp && lindex > findex) lindex--;
            nums[findex] = nums[lindex];
            while (nums[findex] <= tmp && lindex > findex) findex++;
            nums[lindex] = nums[findex];

        }
        nums[lindex] = tmp;
        return lindex;
    }

    private void swap(int num, int num1) {
        int tmp = 0;
        tmp = num;
        num = num1;
        num1 = tmp;
    }

    @Test
    public void test(){
        int[] nums = {1,5,10,278,47839,637,376,64,4,68,3,3,51,4};
        quickSort(nums);
    }
}

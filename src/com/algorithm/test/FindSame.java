package com.algorithm.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindSame {

    public static ArrayList<ArrayList<Integer>> findSum(int[] nums, int sum){
        //输出排序数组中两值为定和所有情况
        Map<Integer, Integer> map = new  HashMap<>();

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for(int i=0;i<nums.length; i++) {
            map.put(nums[i], i);
        }
        for(int i=0;i<nums.length; i++){

            int lall = sum - nums[i];


            if(map.containsKey(lall)){
                ArrayList<Integer> tmp = new ArrayList<>();
                int jj = (lall==nums[i]) ? ((map.get(lall) != i) ? map.get(lall):0):map.get(lall);
                if(jj <= i) break;
                tmp.add(nums[i]);
                tmp.add(nums[jj]);
                lists.add(tmp);
            }
        }
        return lists;
    }

    /*
    private static int[] findSum1(int[] nums, int sum){
        //这个写法有问题
        Map<Integer, Integer> map = new  HashMap<>();

        int[] tmp = new int[nums.length];
        int j = 0;
        for(int i=0;i<nums.length; i++) {
            map.put(nums[i], i);
        }
        for(int i=0;i<nums.length-1; i++){
            int lall = sum - nums[i];

            if(map.containsKey(lall)){

                tmp[j] = i;

                tmp[++j] = (lall==nums[i]) ? ((map.get(lall) != i) ? map.get(lall):0):map.get(lall);
                j++;
            }
        }
        return tmp;
    }*/
    public static void main(String[] args){

        int[] a = {1,4,1,6,6,8,7,5};
        int sum = 12;
        /*for (int ss : findSum1(a, sum))
            System.out.print(ss + " ");*/
        Arrays.sort(a);
        System.out.println();
        for(ArrayList<Integer> i: findSum(a,sum)){
            for (int ss : i)
                System.out.print(ss + "  ");
            System.out.println();
        }
    }

    public static int sumContinue(int n ){



        int ans = n;
        boolean b = n > 0;
        ans += sumContinue(n - 1);
        return ans;
    }

}



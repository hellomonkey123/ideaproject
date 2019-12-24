package com.algorithm.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 * @program: BagProblem
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/12
 */
public class BagProblem {

    //对应不可重复的背包问题，每个种类最多只能取一件
    public int SingleBagProblem(int[][] bags, int quality){

        int[] value = new int[quality + 1];
        for (int i = 0; i < bags.length; i++){
            for (int j = quality; j >= bags[i][0]; j--){
                if (value[j] < value[j - bags[i][0]] + bags[i][1])
                    value[j] = value[j - bags[i][0]] + bags[i][1];
            }
        }
        return value[quality];
    }

    //对应可重复的背包问题，每类物品可以重复选取
    public int repeatBagProblem(int[][] candi, int ta){
        int[] value = new int[ta + 1];
        for (int i = 0; i < candi.length; i++){
            for (int j = candi[i][0]; j <= ta; j++){
                if (value[j] < value[j - candi[i][0]] + candi[i][1])
                    value[j] = value[j - candi[i][0]] + candi[i][1];
            }
        }
        return value[ta];
    }

    public int multiBagProblem(int reactorCap, int n, int maxmass,int[] vol, int[] mass, int[] ener){
        if (n < 1)
            return 0;
        int[][] dp = new int[maxmass + 1][reactorCap + 1];
        for (int i = 0; i < n; i++)
        {
            for (int j = dp.length-1; j > 0; j--)
            {
                for (int k = dp[j].length-1; k > 0; k--)
                {
                    if(vol[i] <= k && mass[i] <=j)
                        dp[j][k] = Math.max(dp[j][k], dp[j - mass[i]][k-vol[i]] + ener[i]);
                }
            }
        }
        return dp[maxmass][reactorCap];
    }

    @Test
    public void test(){
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList linkedList = new LinkedList();
        String str = "jdhkjh";
        Vector vector = new Vector();
        System.out.println(str.substring(0,3));
        int[][] bags = {{2,3},{1,2},{3,4},{2,2}};
        //不可重复背包问题测试结果
        System.out.println(SingleBagProblem(bags,5));

        //可重复背包问题测试结果
        System.out.println(repeatBagProblem(bags,7));
    }
}

package com.algorithm.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class XorGame {
    public boolean xorGame(int[] nums) {
        int count = 0;
        List<int[]> list = new ArrayList<>();
        list.add(nums);
        while(count < nums.length ){
            int[] qq = xorInt(list.get(count));
            if(qq.length == 0){
                break;
            }
            list.add(qq);
            count++;
        }
        return count % 2 == 1 ;
    }

    public int[] xorInt(int[] num){
        int i = 0;
        int tmp = 0;
        int tt = 0;
        for(int j = 0; j < num.length; j++){
            i = 0;
            tmp = 0;
            while(i < num.length){
                if(i != j){
                    tmp ^= num[i];
                }
                i++;
            }
            if(tmp != 0){
                tt = j;
                break;
            }
        }
        if(tmp != 0){
            int[] ss = new int[num.length -1];
            for(i = 0; i < ss.length; i++){
                if(i < tt){
                    ss[i] = num[i];
                }else{
                    ss[i] = num[i + 1];
                }
            }
            return ss;
        }else{
            return new int[0];
        }
    }
    @Test
    public void sss(){
        int[] in = {1, 2};
        System.out.println(xorGame(in));
    }

}

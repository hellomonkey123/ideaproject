package com.algorithm.test;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumPairsDivisibleBy60 {

    public int numPairsDivisibleBy60(int[] time) {

/*        for(int i = 0; i < time.length; i++){
            time[i] %= 60;
        }
        Arrays.sort(time);
        int left = 0, right = time.length -1;
        int tmp = 0, count = 0;
        while(left < right){
            int tmp1 = 0;
            if(time[left] == 0){
                left++;
                tmp++;
            }
            count += tmp*(tmp - 1)/2;
            tmp = 0;
            if(time[left] + time[right] > 60){
                right--;
            }else if(time[left] + time[right] < 60){
                left++;
            }else{
                if(time[left] == time[left++] ){
                    tmp++;
                }
                if(time[left] == time[right--])
                    tmp1++;

            }
            count += (time[left] == 30 ? (tmp + tmp1 -1)*(tmp + tmp1)/2 : tmp * tmp1);
        }*/

        int count = 0;
        int k = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = time.length - 1; i >= 0; i--) {

            k = (60-time[i]%60)%60;  //差数
            if (map.containsKey((60-k)%60)) {
                count+=map.get((60-k)%60);
            }
            if(map.containsKey(k)){ // 第!1次
                map.put(k,map.get(k)+1);
            } else{ //第一次
                map.put(k,1);
            }
        }
        return count;
    }

    @Test
    public void test(){
        int[] num = {30,20,150,100,40,30,30,60,60,20};
        System.out.println(numPairsDivisibleBy60(num));
    }
}

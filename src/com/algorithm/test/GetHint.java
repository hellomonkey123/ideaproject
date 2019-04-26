package com.algorithm.test;

import org.junit.Test;

import java.util.Arrays;

public class GetHint {
    public String getHint(String secret, String guess) {
        char[] secret1 = secret.toCharArray();
        char[] guess1 = guess.toCharArray();
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < guess.length(); i++){
            if(secret1[i] == guess1[i]){
                count1++;
            }
        }
        Arrays.sort(secret1);
        Arrays.sort(guess1);
        for(int i = 0; i < secret.length(); i++){
            int tmp = 0;
            for(int j = tmp; j <guess.length(); j++){
                if(secret1[i] == guess1[j]){
                    count2++;
                    tmp = j + 1;
                    break;
                }
            }
            if(tmp == guess.length()){
                break;
            }
        }
        return  count1 + "A" + (count2 - count1) +"B";
    }

    @Test
    public void test(){
        System.out.println(getHint("1122","1222"));
    }
}

package com.algorithm.test;

import org.junit.Test;

public class IsMatch {

    public boolean isMatch(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        boolean[][] memory = new boolean[sLen + 1][pLen + 1];
        memory[0][0] = true;

        for(int i = 0; i <= sLen; i++){
            for(int j = 1; j <= pLen; j++){
                if(p.charAt(j - 1) == '*' && j > 1){ //这里要控制数组边界问题
                    memory[i][j] = memory[i][j - 2] || (i > 0 && (s.charAt(i - 1) == p.charAt(j -2)|| p.charAt(j - 2) == '.') && memory[i - 1][j]);
                    //注意这里的j - 2，
                }else{
                    memory[i][j] = i > 0 && ( s.charAt(i - 1) == p.charAt(j - 1)|| p.charAt(j - 1) == '.') && memory[i - 1][j - 1];

                }
            }
        }
        return memory[sLen][pLen];
    }

    @Test
    public void test(){
        System.out.println(isMatch("mississippi","**s*is*p*."));
    }
}

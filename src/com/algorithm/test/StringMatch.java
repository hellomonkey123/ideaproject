package com.algorithm.test;

import org.junit.Test;

/**
 * @program: StringMatch
 * @description: 特殊字符匹配，其中'.'代表可以匹配任意字符，
 *      '*'代表可以匹配多个或者零个前一字符，如果零个表示前一字符消失
 * @author: liu yuanwen
 * @create: 2019/7/14
 */
public class StringMatch {
    //这里的str是没有特殊字符的，只有pattern中有特殊字符
    public boolean match(char[] str, char[] pattern){

        if (str == null && pattern == null) return true;

        boolean[][] flag = new boolean[str.length + 1][pattern.length + 1];
        flag[str.length][pattern.length] = true;
        for (int i = str.length; i >= 0; i--){
            for (int j = pattern.length - 1; j >= 0; j--){
                //(i !=str.length)保证‘.’造成的数组越界问题
                boolean first_match = (i !=str.length) && (str[i] == pattern[j] || pattern[j] == '.');
                if (j < pattern.length - 1 && pattern[j + 1] == '*')
                    flag[i][j] = flag[i][j + 2] || (first_match && flag[i + 1][j]);
                else
                    flag[i][j] = first_match && flag[i + 1][j + 1];
            }
        }
        return flag[0][0];
    }

    @Test
    public void test(){
        char[] str = {'a','a','a','a'};
        char[] pattern = {'a','b','*','a','c','*','a','.'};
        System.out.println(match(str, pattern));
    }
}

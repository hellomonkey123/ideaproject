package com.algorithm.test;

import java.util.*;

public class LongestPalindrome {

    public static String longestPalindrome(String s) {

        if (s.equals("")) {
            return "";
        } else {
            char[] str = s.toCharArray();
            int tmp = 0;
            int tmp_t = 0;
            for (int i = 0; i < str.length - 1; i++) {
                for (int j = str.length - 1; j > i; j--) {

                    int t = 0;

                    while ((str[i + t] == str[j - t]) && ((j - i) >= (tmp_t - tmp))) {

                        if ((2 * t == (j - i)) || (2 * t == (j - i - 1))) {
                            tmp = i;
                            //tmp_t = t;   //这样写是有问题的，因为没有区分奇偶
                            tmp_t = j;

                            break;
                        }
                        t++;
                    }


                }
                //for (int ss = tmp; ss <= tmp_t; ss++){
                //    s1.append(str[ss]);
                //}


            }
            return s.substring(tmp, tmp_t + 1);
        }
    }
        public static void main (String[]args){
            String a = "";
            char[] q = longestPalindrome(a).toCharArray();
            for (int i = 0; i < q.length; i++) {
                System.out.print(q[i] + " ");
            }
        }
}

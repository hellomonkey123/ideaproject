package com.algorithm.test;

public class LongestNoRepeat {

    public static int longestNoRepeat(String str){
        char[] p = str.toCharArray();
        int longest = 0;
        if(p.length == 1){
            return 1;
        }
        int i = 0;
        while (i < p.length - 1){
            int tmp = 1;
            if(p[i] == p[i + 1]){
                i++;
            }
            while (i+tmp < p.length){
                //tmp = 1;
                if (p[i] == p[i+tmp]) {
                    break;
                }else{
                    for (int j = i + 1;j < i + tmp; j++ ){
                        if(p[j] == p[tmp + i]){
                            tmp = 0;
                            i = j +1;
                            break;
                        }
                    }
                }
                tmp++;
                longest = (longest < tmp) ? tmp :longest;
            }
            longest = (longest < tmp) ? tmp :longest;
            i++;
        }
        return longest;
    }

    public static void main(String[] args){
        String str = "ddhjkdhkcv";
        System.out.print(longestNoRepeat(str));
    }
}

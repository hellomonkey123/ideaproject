package com.algorithm.test;

import java.util.Scanner;

public class CountLastestWord {

    public static int countLastestWord(String str){

        char[] st = str.toCharArray();
        int i = st.length - 1;
        while ( i > 0){
            if (st[i] == ' '){
               break;
            }
            i--;
        }
        if (i > 0) {
            return st.length - i - 1;
        }else{
            return st.length - i;
        }
    }

    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        String str = src.nextLine();
        int count = countLastestWord(str);

        System.out.print(count);
    }
}

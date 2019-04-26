package com.algorithm.test;

import java.util.Scanner;

public class CountWord {

    public static int countWord(String str){
        int i = 0;

        char[] st = str.toCharArray();
        /*for (int j = 0; j < st.length - 2; j++){

            if (st[st.length - 1] >= 'a' && st[st.length - 1] <= 'z') {
                if (st[j] == st[st.length - 1] || st[j] == st[st.length - 1] + 32 )
                    i++;
            }
            if (st[st.length - 1] >= 'A' && st[st.length - 1] <= 'Z') {
                if (st[j] == st[st.length - 1] || st[j] == st[st.length - 1] - 32)
                    i++;
            }
        }*/
        for (int j = 0; j < st.length - 2; j++) {
            if (st[st.length - 1] >= 'a' && st[st.length - 1] <= 'z' && st[j] == st[st.length - 1] - 32) {

                i++;
            }
            if ((st[st.length - 1] >= 'A' && st[st.length - 1] <= 'Z') && (st[j] == st[st.length - 1] + 32)) {
                i++;
            }
            if (st[j] == st[st.length - 1]) i++;
        }
        return i;
    }

    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        String str = src.nextLine();
        int count = countWord(str);

        System.out.print(count);
    }
}

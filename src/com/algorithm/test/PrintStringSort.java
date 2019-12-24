package com.algorithm.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program: PrintStringSort
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/25
 */
public class PrintStringSort {

    public ArrayList<String> PrintStringSort(String str){

        ArrayList<String> list = new ArrayList<>();
        if (str.length() < 1) return list;
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        list.add(String.valueOf(ch));
        int len = ch.length;
        while (true){
            int lIndex = len - 1, rIndex;  ///必须是完全逆序才会自减到0，跳出循环
            while (lIndex > 0 && ch[lIndex - 1] >= ch[lIndex]){
                lIndex--;
            }
            if(lIndex == 0) break;  //跟上面一起保证循环跳出
            rIndex = lIndex;
            while (rIndex < len && ch[rIndex] > ch[lIndex - 1]) rIndex++;
            swap(ch, lIndex - 1, rIndex - 1);
           // list.add(String.valueOf(ch));
            reverse(ch, lIndex);  //
            list.add(String.valueOf(ch));

        }

        return list;
    }

    public void swap(char[] ch, int i, int j){
        char tmp = ch[i];
        ch[i] = ch[j];
        ch[j] = tmp;

        //return ch;
    }

    public void reverse(char[] ch, int k){
        if (ch == null || ch.length <= k){
            return;
        }
        int len = ch.length;
        for (int i = 0; i < (len - k) / 2; i++){
            int m = k + i;
            int n = len - i - 1;
            if (m <= n)
                swap(ch, m , n);
        }
    }

    @Test
    public void test(){
        String  str = "adjjj";
        for(String ss : PrintStringSort(str)){
            System.out.print(ss + "   ");
        }
    }
}

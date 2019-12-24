package com.algorithm.test;

/**
 * @program: hdlksfajl
 * @description:
 * @author: liu yuanwen
 * @create: 2019/8/8
 */
public class hdlksfajl {
    private static String add(String num1, String num2) {
        //Please write your code here
        StringBuffer tt1;
        String ss = "";
        String[] s1 = num1.split("\\.");
        String[] s2 =num2.split("\\.");
        int tttt = 0;
        if (s1.length > 1 && s2.length > 1) {

            tt1 = new StringBuffer(s1[1].length() > s2[1].length() ? s1[1] : s2[1]);
            int len1 = s1[1].length() > s2[1].length() ? s2[1].length() : s1[1].length();

            while (len1-- > 0) {
                int tmp = (s1[1].charAt(len1) - '0' + (s2[1].charAt(len1) - '0') + tttt);
                tt1.setCharAt(len1, (char) (tmp % 10 + 48));
                tttt = tmp / 10;
            }
            int len2 = tt1.length();
            while(len2-- >=0){
                if (tt1.charAt(len2) != '0') break;
                else tt1.deleteCharAt(len2);
            }
        }else if (s1.length == 1 && s2.length == 1){
            tt1 = new StringBuffer("");

        }else {
            tt1 = new StringBuffer(s1.length != 1 ? s1[1] : s2[1]);
        }
        int qq = s1[0].length();
        int ww = s2[0].length();
        StringBuffer tt2 = new StringBuffer(s1[0].length() > s2[0].length() ? s1[0] : s2[0]);
        while(qq-- >0 && ww-- > 0){
            int tmp = (s1[0].charAt(qq)-'0' + (s2[0].charAt(ww) -'0') + tttt);
            tt2.setCharAt(qq > ww ? qq : ww,(char) (tmp % 10 + 48));
            tttt = tmp / 10;
        }

        if (tt1.length() > 0)  ss = "." + tt1;
        if (tttt == 0)
            return tt2 + ss;
        else {
            if (ww != qq) {
                int len3 = Math.abs(ww - qq) - 1;
                while(tttt == 1 && len3-- > 0) {
                    int tmp = tt2.charAt(len3) - '0' + tttt;
                    tt2.setCharAt(len3, (char) (tmp % 10 + 48));
                    tttt = tmp / 10;
                }
                if (tttt == 1)
                    return "1" + tt2 + ss;
                else
                    return tt2 + ss;
            } else
                return "1" + tt2 + ss;
        }
    }


    public static void main(String[] args) {
        String s1 = "864";
        String s2 = "46326958";
        System.out.println(add(s1, s2));
    }
}

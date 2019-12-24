package com.algorithm.test;

import java.util.Scanner;
import java.util.Stack;

/**
 * @program: StringCompress
 * @description:
 * @author: liu yuanwen
 * @create: 2019/8/17
 */
public class StringCompress {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] chs = s.toCharArray();

        String head = "";
        String last = "";
        int i = 0, j = chs.length - 1;

            while (chs[i] != '[') {
                head += chs[i];
                i++;
            }
            while (chs[j] != ']') {
                last += chs[j];
                j--;
            }

        Stack<Character> st = new Stack<>();
        i = 0;
        String  str = "";
        StringBuffer ss = new StringBuffer("");
        boolean flag = false;
        boolean flag1 = false;
        while (i < chs.length) {

            if ( chs[i] != ']') {
                if(!flag || chs[i] == '[') {
                    st.push(chs[i]);
                    flag = false;
                    flag1 = false;
                }else
                    ss.append(chs[i]);
            }
            else {
                int num = 0;
                StringBuffer ss1 = new StringBuffer(!flag1 ? "" : ss);
                char tmp = st.pop();
                while (tmp != '['){
                    if (tmp != '|' && !(tmp - '0' > 0 && tmp - '0' <= 9)) ss1.insert(0, tmp);
                    if(tmp - '0' > 0 && tmp - '0' <= 9) num = tmp - '0';
                    tmp = st.pop();
                }

                //StringBuffer buffer = new StringBuffer();
                if(flag){
                    ss = new StringBuffer("");
                    while (num-- > 0) {
                        ss.append(ss1);
                    }
                }else {
                    while (num-- > 0) {
                        ss.append(ss1);
                    }
                    //ss.append(buffer);
                }
                flag = true;
                flag1 = true;
            }
            i++;
        }

        str = head + ss;

        System.out.println(str);
    }


}

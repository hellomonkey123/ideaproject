package com.algorithm.test;

import org.junit.Test;

/**
 * @program: ReverseString
 * @description:
 * @author: liu yuanwen
 * @create: 2019/6/21
 */
public class ReverseString {
    public String reverse(String str){
        if (str == null || str.length() <= 1)
            return str;
        //substring 截取

        /*
        * 测试finally中的语句会不会被执行
        try {
            return reverse(str.substring(1)) + str.charAt(0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("hhhhhhhhh");
        }
         return str;
        *输出结果
        *   hhhhhhhhh
            hhhhhhhhh
            hhhhhhhhh
            hhhhhhhhh
            hhhhhhhhh
            hhhhhhhhh
            hhhhhhhhh
            hhhhhhhhh
            309765321
        */
        return reverse(str.substring(1)) + str.charAt(0);
    }

    @Test
    public void test(){
        String str = "123567903";
        System.out.println(reverse(str));
    }
}

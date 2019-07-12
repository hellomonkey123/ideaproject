package com.jvm.test;

import org.junit.Test;

public class ConstanTest {

    @Test
    public void test(){

        //intern运行期间将新的常量放入常量池中
        String s1 = new StringBuilder("go").append("od").toString();
        System.out.println(s1.intern() == s1);

        String s2 = new StringBuilder("jj").append("na").toString();

        System.out.println(s2.intern() == s2);
    }

    @Test
    public void test2(){
        Integer a1 = 100, a2 = 100, a3 = 200, a4 = 200;
        //整型值在-128到127之间，Integer直接引用常量池中
        // 的Integer对象，超过这个范围就new新的对象
        System.out.println(a1 == a2);  //true
        System.out.println(a3 == a4);  //false
    }

    @Test
    public void test3(){
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;  //拼接
        System.out.println(s1 == s2);  //false
        System.out.println(s1 == s5);  //true
        System.out.println(s1 == s6);  //false
        System.out.println(s1 == s6.intern());   //true
        //intern取得是常量池中的数据，有，可以取出
        System.out.println(s2 == s2.intern()); //false
    }
}

package com.java18.newchara.test;

import org.junit.Test;

import java.util.function.Consumer;
//消费型接口，有参无返回值
public class ConsumerT {
    public void changeStr(String str, Consumer<String> con){
        con.accept(str);
    }

    @Test
    public void test(){
        //  只有一个参数，（）可以省略
        // changeStr("hello",(str) -> System.out.println(str));
        changeStr("hello",str -> System.out.println(str));
    }
}

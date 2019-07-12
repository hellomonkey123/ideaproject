package com.java18.newchara.test;

import org.junit.Test;

import java.util.function.Function;
//函数式接口
public class FunctionTR {

    public Long changeNum(Long num, Function<Long,Long> fun){
        return fun.apply(num);
    }
    //打印结果为300
    @Test
    public void test(){
        Long result = changeNum(100L, x -> x + 200L);
        System.out.println(result);
    }
}

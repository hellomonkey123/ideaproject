package com.java18.newchara.test;

import org.junit.Test;

import java.util.function.Predicate;

public class PredicateT {

    public boolean changeBoolean(String str, Predicate<String> pre){
        return pre.test(str);
    }

    @Test
    public void test(){
        boolean result = changeBoolean("hello",str -> str.length() > 5);
        System.out.println(result);
    }
}

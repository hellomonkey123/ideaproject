package com.java18.newchara.test;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;
//供给型接口，无参有返回
public class SupplierT {

    public String getValue(Supplier<String> supplier){
        return supplier.get();
    }

    @Test
    public void test(){
        String value = getValue(() -> "hello");
        System.out.println(value);
    }

    /*public T supplier(int num, Supplier<Integer> supplier){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++){
            Integer integer = supplier.get();
            list.add(integer);
        }
        return (T)list;
    }

    @Test
    public void test2(){
        int num = 5;
        List<Integer> list = (List)supplier(num, () -> {
        return (int)(Math.random()*50 + 50);
        });

        list.forEach(System.out::println);
    }*/
    @Test
    public void test3(){

        Map map = new Hashtable();
        Map map1 = new HashMap();
        Map map2 = new ConcurrentHashMap();
    }
}

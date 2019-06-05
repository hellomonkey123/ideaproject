package com.java18.newchara.test;

import java.util.function.Supplier;
//供给型接口，无参有返回
public class SupplierT {

    public String getValue(Supplier<String> supplier){
        return supplier.get();
    }

    public void test(){
        String value = getValue(() -> "hello");
        System.out.println(value);
    }
}

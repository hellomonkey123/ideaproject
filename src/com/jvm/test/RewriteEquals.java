package com.jvm.test;

import org.junit.Test;

import java.util.HashMap;

/**
 * @program: RewriteEquals
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/19
 */
public class RewriteEquals {

    private String color;

    public RewriteEquals(String clo){
        this.color = clo;
    }

    public boolean equals(Object obj){
        if (obj == null) return false;
        if (!(obj instanceof  RewriteEquals)) return false;
        if (obj == this) return true;

        return this.color.equals(((RewriteEquals) obj).color);
    }

    //@Test
    public static void main(String[] args){
        RewriteEquals rewriteEquals1 = new RewriteEquals("green");
        RewriteEquals rewriteEquals2 = new RewriteEquals("red");

        HashMap<RewriteEquals, Integer> map = new HashMap<>();

        map.put(rewriteEquals1, 10);
        map.put(rewriteEquals2, 30);

        System.out.println(map.get(new RewriteEquals("green")));

    }
}

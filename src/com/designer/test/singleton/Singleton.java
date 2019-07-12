package com.designer.test.singleton;

import org.junit.Test;

//双锁机制的单例
public class Singleton{
    private static volatile Singleton singleton;
    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    @Test
    public void test(){
        Singleton.getInstance();
    }
}

package com.algorithm.test;

import com.sun.org.apache.xalan.internal.xsltc.dom.SingletonIterator;

 class Tes{
    private static int aa =1;
    public int getss(){
        return aa++;
    }
}
public class Singleton_test {

    //静态常量实现单例模式
    private final static SingletonIterator INSTANCE = new SingletonIterator();

    //静态代码块实现单例
    private static SingletonIterator instance;
    static {
        instance = new SingletonIterator();
    }

    //双重检查实现单例模式
    private static volatile SingletonIterator singleton;
    public static SingletonIterator getInstance(){
        if (singleton == null){
            synchronized (SingletonIterator.class){
                if (singleton == null){
                    singleton = new SingletonIterator();
                }
            }
        }
        return singleton;
    }

    //静态内部类实现
    public static class SingletonInstance{
        private final static SingletonIterator SINGLETON_ITERATOR = new SingletonIterator();
    }
    public static SingletonIterator getS_Instance(){
        return SingletonInstance.SINGLETON_ITERATOR;
    }

    //枚举
    public enum Singleton{
        INSTANCE;
        public void whateverMethod(){}
    }

    public static void main(String[] args){

        Tes tt = new Tes();
        Tes tut = new Tes();
        tt.getss();
        tut.getss();
        System.out.println(tut.getss());
        Object o = new Object();
        String i = o.toString();
        System.out.println(o);
        System.out.println("______--------");
        System.out.println(i);
    }
}

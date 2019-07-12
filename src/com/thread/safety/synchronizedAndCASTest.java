package com.thread.safety;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

public class synchronizedAndCASTest {

    //synchronized锁初始化的值
    private static int count = 0;
    //CAS初始化的值
    private static AtomicInteger count1 = new AtomicInteger(0);

    @Test
    public void test1(){
        for (int i = 0; i < 2; i++){
            new Thread(() -> {
                try{
                    Thread.sleep(10);
                }catch (Exception e){
                    e.printStackTrace();
                }
                for ( int j = 0; j < 200; j++){

                    synchronized (synchronizedAndCASTest.class){
                        count++;
                    }
                }
            }).start();
        }

        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(count);
    }

    @Test
    public void test2(){
        for (int i = 0; i < 2; i++){
            new Thread(() -> {
                try{
                    Thread.sleep(10);
                }catch (Exception e){
                    e.printStackTrace();
                }
                for ( int j = 0; j < 200; j++){
                    //底层用的是unsafe.getAndAddInt，其中调用compareAndSwapInt方法
                    count1.incrementAndGet();
                }
            }).start();
        }

        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(count);
    }
}

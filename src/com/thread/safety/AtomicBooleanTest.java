package com.thread.safety;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBooleanTest implements Runnable {

    private static AtomicBoolean flag = new AtomicBoolean(true);

    @Override
    public void run(){
        System.out.println("thread: " + Thread.currentThread().getName() + "; flag : " + flag.get());

        if (flag.compareAndSet(true,false)){
            System.out.println(Thread.currentThread().getName() + " " + flag.get());
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            flag.set(false);
        }else {
            System.out.println("try again Thread : " + Thread.currentThread().getName() + "; flag : " + flag.get());
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            run();
        }
    }

    @Test
    public void test(){
        AtomicBooleanTest cas = new AtomicBooleanTest();

        Thread th1 = new Thread(cas);
        Thread th2 = new Thread(cas);

        th1.run();
        th2.run();
    }
}

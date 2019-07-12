package com.thread.safety;

import com.designer.test.singleton.Singleton;
import org.junit.Test;

public class VolatileTest {

    private static volatile int race = 0;
    private static final int THREADS_COUNT = 20;

    public static void increase(){
        race++;
    }

    @Test
    public void test(){
        Thread[] threads = new Thread[THREADS_COUNT];
        for (int i = 0; i < THREADS_COUNT; i++){
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 10; j++){
                    increase();
                }
            });
            threads[i].start();
        }
        while (Thread.activeCount() > 1){
            Thread.yield();
        }
        System.out.println(race);
    }
}

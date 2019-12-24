package com.thread.safety.forkjoinpool.test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

/**
 * @program: ForkJoinPoolTest
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/28
 */
public class ForkJoinPoolTest {

    public static void main(String[] args) throws Exception{
        ForkJoinPool forkJoinPool = new ForkJoinPool(4);

        PiEstimateTask task = new PiEstimateTask(0, 10000000, 500000);
        Future<Double> future = forkJoinPool.submit(task);
        double pi = forkJoinPool.invoke(task);
        System.out.println(" the value of π: " + pi);
        System.out.println("future 指向的对象是 task 吗：" + (future == task));

        forkJoinPool.shutdown();
    }
}

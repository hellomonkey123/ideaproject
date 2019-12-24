package com.thread.safety.handler.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @program: DiscardPolicyDemo
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/29
 */
public class DiscardPolicyDemo {

    private static final int THREADS_SIZE = 1;
    private static final int CAPACITY = 3;

    public static void main(String[] args) throws Exception{

        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(THREADS_SIZE, THREADS_SIZE, 0, TimeUnit.SECONDS, new ArrayBlockingQueue<>(CAPACITY));

        poolExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());

        for (int i = 0; i < 10; i++){
            Runnable myrun = new MyRunable("task-" + i);
            poolExecutor.execute(myrun);

        }


        poolExecutor.shutdown();
    }
}

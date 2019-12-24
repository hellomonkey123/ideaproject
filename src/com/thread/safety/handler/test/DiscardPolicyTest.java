package com.thread.safety.handler.test;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @program: DiscardPolicyTest
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/29
 */
public class DiscardPolicyTest {

    private static final RejectedExecutionHandler defaultHandler = new AbortPolicy();
    public static class AbortPolicy implements RejectedExecutionHandler{
        public AbortPolicy(){}

        public void rejectedExecution(Runnable r, ThreadPoolExecutor e){
            throw new RejectedExecutionException("Task " + r.toString() +  "rejected from " + e.toString());
        }
    }
}

class MyRunable implements Runnable{
    private String name;
    public MyRunable(String name){
        this.name = name;
    }

    @Override
    public void run(){
        try{
            System.out.println(this.name + " is running");
            Thread.sleep(100);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
package com.thread.safety.forkjoinpool.test;

import java.util.concurrent.RecursiveTask;

/**
 * @program: PiEstimateTask
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/28
 */
public class PiEstimateTask extends RecursiveTask<Double> {
    private final long begin;
    private final long end;
    private final long threshold;

    public PiEstimateTask(long begin, long end, long threshold){
        this.begin = begin;
        this.end = end;
        this.threshold = threshold;
    }

    @Override
    protected Double compute(){
        if (end - begin <= threshold){
            int sign;
            double result = 0.0;
            for (long i = begin; i < end; i++){
                sign = (i & 1) == 0 ? 1 : -1;
                result += sign / (i * 2.0 + 1);
            }
            return result * 4;
        }

        //分割任务
        long mid = begin + (end - begin) / 2;
        PiEstimateTask leftTask = new PiEstimateTask(begin, mid, threshold);
        PiEstimateTask rightTask = new PiEstimateTask(mid, end, threshold);


        leftTask.fork();
        rightTask.fork();

        double leftResult = leftTask.join();
        double rightResult = rightTask.join();

        return leftResult + rightResult;
    }
}

package com.thread.safety;

/**
 * @program: ReentrantLockTest
 * @description:  可重入锁设计
 * @author: liu yuanwen
 * @create: 2019/7/24
 */
public class ReentrantLockTest {

    private boolean isLocked = false;
    private Thread lockedBy = null;
    private int lockedCount = 0;  //这个lockedCount跟isLocked搭配使用
    public synchronized void lock() throws InterruptedException{
        Thread thread = Thread.currentThread();
        while (isLocked && lockedBy != thread){
            wait();
        }
        isLocked = true;
        lockedCount++;
        lockedBy = thread;
    }

    public synchronized void unlock(){
        if (Thread.currentThread() == this.lockedBy){
            lockedCount--;
            if (lockedCount == 0){
                isLocked = false;
                notify();
            }
        }
    }
}

package com.algorithm.test;

import java.util.Stack;

/**
 * @program: StackToQueue
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/7
 */
public class StackToQueue {

    Stack<Integer> stack1 = new Stack<>(); //作为队列入口
    Stack<Integer> stack2 = new Stack<>(); //作为队列出口

    public void push(int num){
        stack1.push(num);
    }
    //出队列的时，stack2不为空，则弹出stack2栈顶，
    // 否则stack1全部压到stack2，stack2栈顶弹出
    public int pop(){
        if (stack2.empty() && stack1.empty()){
            try{
                throw new Exception("the queue is empty");
            }catch (Exception e){}
        }else if (stack2.empty()){
            while(stack1.size() > 0){
                stack2.push(stack1.pop());
            }
            /*
            //优化，stack1不需要全部压到stack2，最后一个可以直接弹出
            while(stack1.size() > 1){
                stack2.push(stack1.pop());
            }
            return stack1.pop();
            */

        }
        return stack2.pop();
    }




}

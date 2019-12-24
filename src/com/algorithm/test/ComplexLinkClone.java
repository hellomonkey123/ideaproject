package com.algorithm.test;

/**
 * @program: ComplexLinkClone
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/19
 */
public class ComplexLinkClone {

    private class RandomListNode{
        int val;
        RandomListNode next = null;
        RandomListNode random = null;

        public RandomListNode(int val){
            this.val = val;
        }
    }

    public RandomListNode Clone(RandomListNode pHead){

        if (pHead == null) return null;
        RandomListNode current = pHead;
        while(current != null){
            //在每个节点后面插入该节点值
            RandomListNode node = new RandomListNode(current.val);
            node.next = current.next;
            current.next = node;
            current = node.next;
        }

        //进一步复制random指针
        current = pHead;
        while (current != null){
            current.next.random = current.random != null ? current.random.next : null ; //因为插入后
            current = current.next.next;
        }

        current = pHead;

        //把复制的节点连起来
        while (current != null){
            RandomListNode tmp = current.next;
            current.next = tmp.next;
            tmp.next = tmp.next == null ? null : tmp.next.next;
            current = current.next;
        }
        //返回复制节点
        return pHead.next;
    }
}

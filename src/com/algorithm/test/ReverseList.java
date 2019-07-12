package com.algorithm.test;

/**
 * @program: ReverseList
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/3
 */
public class ReverseList {

    public ListNode reverseList(ListNode head){

        ListNode pre = null;
        ListNode reverseNode = null;
        ListNode current = head;
        ListNode tmp;

        if (current != null){
            tmp = current.next;  //tmp保持current可以往后面走
            if (tmp == null)
                reverseNode = current;
            current.next = pre;  //pre实现current反转
            current = tmp;       //上面两个位置不能反，不然GC会进行回收
            pre = current;
        }



        return reverseNode;
    }

}

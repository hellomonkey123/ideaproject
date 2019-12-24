package com.algorithm.test;

import org.junit.Test;

import javax.xml.ws.Service;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: LinkedListMethods
 * @description:
 * @author: liu yuanwen
 * @create: 2019/8/20
 */

public class LinkedListMethods {

    public  ListNode  reverseLinkedList(ListNode list, int st, int end){


        if (list == null) return list;

        ListNode tmp = new ListNode(0);
        tmp.next = list;
        ListNode cur = tmp;
        while (--st > 0 && cur != null){
            cur =cur.next;
            end--;
        }
        if (cur == null) return null;
        ListNode pre = cur.next;
        ListNode ne = pre.next;
        while (ne != null && --end > 0){
            //指针的指向是从右到左，从右到左读
            pre.next = ne.next;
            ne.next = cur.next;
            cur.next = ne;
            ne = pre.next;
        }
        return tmp.next;

    }

    public ListNode  reverse(ListNode list){
        if (list == null) return list;

        ListNode tmp = new ListNode(0);
        tmp.next = list;
        ListNode cur = tmp;

        ListNode  pre = cur.next;
        ListNode ne = pre.next;

        while(ne != null){
            pre.next = ne.next;
            ne.next = cur.next;
            cur.next = ne;
            ne = pre.next;
        }

        return tmp.next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        //ListNode dummyHead = l1;
        ListNode p = l1, q = l2;
        int tmp = 0;
        while (p != null && q != null) {
            int sum = p.val + q.val + tmp;
            p.val = sum % 10;
            tmp = sum / 10;
            if(p.next == null || q.next == null) break;
            p = p.next;
            q = q.next;
        }

        if(tmp == 1){

            if(p.next == null && q.next == null){
                ListNode dum = new ListNode(1);
                p.next = dum;
            }else if(p.next == null){
                p.next = q.next;
                p.next.val = p.next.val + 1;
            }else{
                p.next.val = p.next.val + 1;
            }
        }else{
            if(p.next == null && q.next != null){
                p.next = q.next;
            }
        }
        return l1;
    }


    @Test
    public void test() throws UnsupportedEncodingException {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next = new ListNode(6);
        ListNode listNode4 = new ListNode(2);
        listNode4.next = new ListNode(8);
        listNode4.next.next = new ListNode(3);

        ListNode addNode = addTwoNumbers(listNode, listNode4);
        List<Integer> list = new ArrayList<>();
        ListNode listNode1 = listNode;
        ListNode tmp = reverseLinkedList(listNode, 2, 4);

       /* while (listNode != null){
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        System.out.println();*/
        while (tmp != null){
            System.out.print(tmp.val + " ");
            tmp = tmp.next;
        }

        System.out.println();
        while (listNode != null){
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        System.out.println();
        ListNode tmp1 = reverse(listNode1);
        while (tmp1 != null){
            System.out.print(tmp1.val + " ");
            tmp1 = tmp1.next;
        }

    }
}

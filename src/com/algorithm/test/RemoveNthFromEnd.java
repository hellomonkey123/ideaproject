package com.algorithm.test;

import com.sun.org.apache.xalan.internal.xsltc.dom.SingletonIterator;
import com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBaseIterators;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode slow = head, fast = head;
        for(int i = 0; i < n; i++){
            fast = fast.next;
        }
        if(fast == null){
            if(n == 1)
                return null;
            else{
                slow = slow.next;
            }
        }else{
            while(fast.next != null){
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
        }

        return head;
    }

    @Test
    public void test(){
        ListNode node = new ListNode(1);
        node = new ListNode(2);
        node = new ListNode(3);
        Map map = new ConcurrentHashMap();
        System.out.println(removeNthFromEnd(node,3));
    }
}

package com.algorithm.test;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class SumLinklist {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummyHead  = new ListNode(0);
        ListNode p = l1, q = l2, crr = dummyHead;

        int carry = 0;

        while(p != null || q != null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;

            crr.next = new ListNode(sum % 10);

            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0){
            crr.next = new ListNode(carry);
        }

        return dummyHead.next;
    }
}

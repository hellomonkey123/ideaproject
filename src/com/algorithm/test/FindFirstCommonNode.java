package com.algorithm.test;
/*

public class ListNode{
    int val;
    ListNode next = null;

    ListNode(int val){
        this.val = val;
    }
}
*/
public class FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        //注释部分算法复杂度较高
        //int len1 = 0;
        //int len2 = 0;
        ListNode tmp1 = pHead1;
        ListNode tmp2 = pHead2;
        /*
        while(tmp1.next != null){
            len1++;
        }
        while(tmp2.next != null){
            len2++;
        }
        int t = Math.abs(len1 - len2);
        if(len1 > len2){
            while(t > 0){
                pHead1 = pHead1.next;
                t--;
            }
        }else{
            while(t > 0){
                pHead2 = pHead2.next;
                t--;
            }
        }
        while(pHead1 != null){
            if(pHead1 == pHead2) break;
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        */
        while( tmp1 != tmp2){
            //循环链表，总会在交点相遇，而且必定相遇在第一个交点
            tmp1 = tmp1 == null ? pHead1 : tmp1.next;
            tmp2 = tmp2 == null ? pHead2 : tmp2.next;
        }
        return tmp1;
    }
}

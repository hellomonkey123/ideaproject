package com.algorithm.test;

import org.junit.Test;

import java.util.PriorityQueue;

/**
 * @program: SortMethods
 * @description:
 * @author: liu yuanwen
 * @create: 2019/8/22
 */
public class SortMethods {


    private static void QuickSort(int[] a, int lo, int hi) {
        if (hi <= lo) return;
        int i = lo;
        int j = hi;
        int tmp = a[lo];
        while (i < j){
            //先右再左
            while (a[j] >= tmp && i < j) j--;
            while (a[i] <= tmp && i < j) i++;

            int t = a[i];
            a[i] = a[j];
            a[j] = t;

        }
        a[lo] = a[i];
        a[i] = tmp;
        //int q = partition(a, lo, hi);
        QuickSort(a, lo, j - 1);
        QuickSort(a, j + 1, hi);
    }

   /* private static int partition(int[] a, int lo, int hi) {
        int i = lo;
        int j = hi;
        int tmp = a[lo];
        while (i < j){
            while (a[i] <= tmp && i < j) i++;
            while (a[j] >= tmp && i < j) j--;


            int t = a[i];
            a[i] = a[j];
            a[j] = t;

        }
        a[lo] = a[i];
        a[i] = tmp;
        return j;
    }
*/

    public static void MergSort(int[] a, int lo, int hi){
        if (lo > hi) return;
        int mid = lo + (hi - lo) / 2;
        MergSort(a, lo, mid);
        MergSort(a, mid + 1, hi);
        Merg(a, lo, mid, hi);
    }

    private static void Merg(int[] a, int lo, int mid, int hi) {
        int[] tmp = new int[hi - lo + 1];
        for (int i = 1; i <= hi; i++){
            tmp[i - 1] = a[i];
        }

        int head1 = 1, head2 = mid + 1;
        for (int j = 1; j <= hi; j++){
            if (head1 > mid){
                a[j] = tmp[head1++];
            }
            else if(head2 > hi) a[j] = tmp[head2++];
            else if (tmp[head1] < tmp[head2]) a[j] = tmp[head1++];
            else a[j] = tmp[head2++];
        }
    }

    @Test
    public static void main(String[] args){
        int[] a = {2, 1, 5, 6, 3, 4, 9, 7, 10, 8};

        MergSort(a, 0, a.length - 1);
        //QuickSort(a, 0, a.length - 1);

        for (int ss : a)
            System.out.print(ss + " ");

    }

}

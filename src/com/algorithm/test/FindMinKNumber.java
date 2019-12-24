package com.algorithm.test;

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @program: FindMinKNumber
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/16
 */
public class FindMinKNumber {
    //构建一个最大堆或者最小堆
    private void downHeap(int[] arr, int index, int length){
        int tmp = arr[index];
        int childIndex = 2 * index + 1;
        while (childIndex < length){

            if (childIndex + 1 < length && arr[childIndex + 1] > arr[childIndex]) childIndex++;

            if (tmp >= arr[childIndex]) break;  //调整这两个if里面的判读即可实现对应最大堆或者最小堆

            arr[index] = arr[childIndex];
            //arr[childIndex] = tmp;
            index = childIndex;

            childIndex = 2 * childIndex + 1;
        }
        arr[index] = tmp;
    }

    private void buildHeap(int[] arr, int length){

        for (int i = (length - 1)/ 2; i >= 0; i--){
            downHeap(arr, i, length);
        }
    }

    private int findNumK(int[] arr,int k){
        buildHeap(arr, arr.length);
        System.out.println("-----------------");
        for (int s : arr)
            System.out.print(s + " ");
        System.out.println();
        for (int i = k; i < arr.length; i++){
            if (arr[i] < arr[0]){
                arr[0] = arr[i];
                downHeap(arr, 0, k);
            }
        }
        return arr[0];
    }

    @Test
    public void test(){
        int[] arr = {1,28,3,3,46,48,847,28,64,647,13,4,5};
        int k = 14;
        System.out.println("-----------------");
        for (int s : arr)
            System.out.print(s + " ");
        int result = findNumK(arr, k);
        System.out.println("-----------------");
        for (int s : arr)
            System.out.print(s + " ");
        System.out.println("-----------------");
        System.out.println(result);
    }
}

package com.algorithm.test;

/**
 * @program: MethodsOfHeap
 * @description:
 * @author: liu yuanwen
 * @create: 2019/8/14
 */
public class MethodsOfHeap {

    private static void downHeap(int[] arr, int index, int size){

        int tmp = arr[index];
        int left = index * 2 + 1;

        //把当前大的放到下面
        while (left < size){
            if (left + 1 < size && arr[left + 1] < arr[left]) left++;

            if (tmp <= arr[left]) break;
            arr[index] = arr[left];
            index = left;
            left = left * 2 + 1;
        }
        arr[index] = tmp;
    }

    private static void buildHeap(int[] arr){
        for (int i = (arr.length - 1) / 2; i >= 0; i++){
            downHeap(arr, i, arr.length);
        }
    }

    private static int findKthNum(int k, int[] arr){
        for (int i = 0; i < k; i++){
            if (arr[i] < arr[k])
                arr[i] = arr[k];
            downHeap(arr, i, k);
        }
        return arr[0];
    }


    public static void main(String[] args){
        int[] arr = {1, 2, 54, 43, 543, 5, 67, 21, 32};
        System.out.println(findKthNum(4,arr));
    }
}

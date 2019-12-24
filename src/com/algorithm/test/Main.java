package com.algorithm.test;

/*
import java.util.Scanner;

*/
/**
 * @program: Main
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/12
 *//*



import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
    public static void main(String args[]){
        int n;
        List<Integer>  list1=new ArrayList<>();
        List<Integer>  list2=new ArrayList<>();
        Scanner in=new Scanner(System.in);

        n = in.nextInt();
        int[] aa = new int[2];

        for (int i = 0; i < 2; ++i) {
            aa[i] = in.nextInt();
        }
        int[][] tt = new int[aa[1]][2];
        for (int j = 0; j < aa[1]; j++) {
            for(int i = 0; i < 2; ++i){
                tt[j][i] = in.nextInt();
            }
        }




    }
}

*/
import sun.nio.ch.ThreadPool;

import java.util.*;
class Count{
    public int count(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                    count++;
                }
            }
        }
        return count;
    }
}

class IsBalancedTree {
    public boolean IsBalancedTree(TreeNode root) {
        if(root == null){
            return true;
        }
        return Math.abs(TreeDepth(root.left)-TreeDepth(root.right)) <= 1 && IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }

    public int TreeDepth(TreeNode root) {
        if(root != null)
            return 1 + Math.max(TreeDepth(root.left),TreeDepth(root.right));
        else
            return 0;
    }
}

public class Main {

    public static void main(String[] args) {

       // Scanner sc = new Scanner(System.in);
       // String con = sc.nextLine();
        String ss = "abc";
        String sss = new String("abc");
        String ssss = "a"+"b"+"c";
        System.out.println(ss == sss);
        System.out.println(sss == ssss);


       /* String[] cons = con.split(" ");
        int[] con_num = new int[2];
        for (int i = 0; i < 2; i++){
            con_num[i] = Integer.parseInt(cons[i]);
        }
        int[][] nums = new int[con_num[0]][2];
        for (int i = 0; i < con_num[0]; i++){
            for (int j = 0; j < 2; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < con_num[0]; i++){
            System.out.println(countSortNum(nums[i][0], nums[i][1], con_num[1]));
        }*/
        /*
        String[] strs = str.split(" \\+ | - | \\* | \\/ ");
        char[]  fuhao = new char[len - 1];


        int[] nums = new int[len];
        for(int i = 0; i < len; i++){
            nums[i] = Integer.parseInt(strs[i]);
        }
        for (int i = 0; i < len - 1; i++){
            fuhao[i] = str.charAt(str.indexOf(strs[i]) + 2);
        }
        int j = 0, count = 0;
        while (j < len - 1){
            if (fuhao[j] == '+') {
                while (fuhao[j] == '+') j++;
            }else if(fuhao[j] == '-') {
                while (fuhao[j] == '-') j++;
            }else if(fuhao[j] == '*') {
                while (fuhao[j] == '*') j++;
            }else
                while (fuhao[j] == '/') j++;

            if(j > 1){
                int[] so = new int[j];
                for(int tt = 0; tt < j; tt++){
                    so[tt] = nums[tt + count];
                }
                Arrays.sort(so);
                for(int tt = 0; tt < j; tt++){
                    nums[tt + count] = so[tt];
                }
            }
            count += (j + 1);
        }

        for(int i = 0; i < len - 1; i++){
            System.out.print(nums[0] + " " + fuhao[i] + " ");
        }
        System.out.print(nums[len - 1]);*/

       /* ArrayList<Integer> list = new ArrayList<>();
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        for(int i = 0; i < str.length(); i++){
            if(!set.add(str.charAt(i))) {
                max = set.size() > max ? set.size() : max;
                set.clear();
                set.add(str.charAt(i));
            }
        }*/



       /* int si = str.length();
        int[] conStr = new int[26];
        for (int i = 0; i <si; i++)
            conStr[str.charAt(i) - 'A'] = i;
        int j = 0;
        while (j < si){
            int tmp = conStr[str.charAt(j) - 'A'];
            for (int i = j + 1; i < tmp && i < si; i++){
                tmp = conStr[str.charAt(i) - 'A'] > 'A' ? conStr[str.charAt(i) - 'A'] : tmp;
            }
            list.add(tmp - j + 1);
            j = tmp + 1;
        }*/

     /*   int preIndex = -1;

        for (int i = 0; i < str.length(); i++) {

            int index = str.lastIndexOf(str.charAt(i));
            if (i > preIndex) {
                list.add(index - i + 1);
                preIndex = index;
            }
            if (index > preIndex) {
                int tmp = index - preIndex;
                int len = list.remove(list.size() - 1);
                list.add(len + tmp);
                preIndex = index;
            }
        }
        for (int ss : list)
            System.out.print(ss + " ");*/



    }

    public static int countSortNum1(int a, int b, int ss){
        int count = b - a + 1;
        int mul = 1;
        while(mul * ss <= b){
            //if (mul * ss >= a) count++;
            count += (b - mul * ss + 1);
            int tmp = b;
            while (--tmp >= a && tmp >= mul * ss){
                //count += tmp == mul * ss ? 1 : ((tmp - mul * ss + 1) * mul;
            }
            mul++;
        }

        return count;
    }

    public static int countSortNum(int b, int a, int ss){
        int count = a - b + 1;
        int mul = 1;
        while(mul * ss <= a){
            //if (mul * ss >= a) count++;
            int tmp = 0;
            if(mul * ss < b) tmp = (a + b - 2 * mul * ss + 2 ) * (a - b + 1) / 2;
            else tmp = (a - mul * ss + 2) * (a - mul * ss + 1) / 2;
            count += tmp;
            mul++;
        }

        return count;
    }

    public static int[] add2048(int[] a){
        int[] tmp = new int[4];
        int i = 0, count = 0;
        while ( i < 4){
           while (a[i] == 0) {
               i++;
               count++;
           }
           tmp[i - count] = a[i];
           i++;
        }
        return a;
    }


       /* String[] s = sc.nextLine().split(",");
        int num = s.length;
        float[] arr = new float[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Float.parseFloat(s[i]);
        }

        float max = Float.MIN_VALUE;
        if(num == 1)  max = arr[0];
        else{
            float[] tmp = new float[num];
            tmp[0] = arr[0];
            for (int i=1; i<arr.length; i++) {
                tmp[i] = Math.max(tmp[i-1] * arr[i], arr[i]);
                max = Math.max(max, tmp[i]);
            }
        }

        System.out.println(max);
    }
*/
        /*Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int[] nums = new int[str.split(" ").length];
        for (int i = 0; i < str.split(" ").length; i++)
            nums[i] = Integer.parseInt(str.split(" ")[i]);
        System.out.println(longConti(nums));
    }
        public static int longConti(int[] nums) {
            Set<Integer> sets = new HashSet<>();
            for (int num : nums) {
                sets.add(num);
            }

            int maxNum = 0;

            for (int num : sets) {
                if (!sets.contains(num-1)) {
                    int currentNum = num;
                    int currentStreak = 1;

                    while (sets.contains(currentNum+1)) {
                        currentNum += 1;
                        currentStreak += 1;
                    }

                    maxNum = Math.max(maxNum, currentStreak);
                }
            }

            return maxNum;
        }
*/
        /*
        //查找连续字串，按字串顺序
        Scanner sc = new Scanner(System.in);


        int num = sc.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        if (num == 1) count = 100;
        else if (num == 2) {
            count = arr[0] == arr[1] ? 200 : 300;
        } else {
            int i = 0;
            ArrayList<Integer> list = new ArrayList<>();

            int cur = 0;
            while (i < num - 1) {
                while (arr[i] == arr[i + 1]) i++;
                if (arr[i] > arr[i + 1]) {
                    while (i < num - 1 && arr[i] >= arr[i + 1]) i++;
                    int tmp = i;
                    int tmp_pay = 100;
                    list.add(tmp_pay);
                    while (--tmp >= cur) {
                        if (arr[tmp] != arr[tmp + 1]) tmp_pay += 100;
                        list.add(tmp_pay);
                    }

                } else if (arr[i] < arr[i + 1]) {
                    while (i < num - 1 && arr[i] <= arr[i + 1]) i++;

                    int tmp_pay;
                    if (cur > 0) {
                        tmp_pay = 200;
                    } else {
                        tmp_pay = 100;
                    }
                    list.add(tmp_pay);
                    while (++cur <= i) {
                        if (arr[cur - 1] != arr[cur]) tmp_pay += 100;
                        list.add(tmp_pay);
                    }
                }
                cur = i + 1;

            }
            for (int ss : list) {
                count += ss;
            }

      *//*      int cnt = 0;
            while(num > 0) {
                cnt += (num & 1);
                num = num >> 1;
            }
            System.out.println(cnt);

            System.out.println(Sum_Solution(num));*//*


        }
        System.out.println(count);
        ScheduledThreadPoolExecutor threadPool = new ScheduledThreadPoolExecutor(3);
        ExecutorService executorService = Executors.newCachedThreadPool();
        String a = "748";
        String b = "748";

        Queue queue = new ArrayBlockingQueue(3);
        Thread th = new Thread();
        queue.add(th);

        System.out.println(a == b);
        Vector vector = new Vector();*/



}
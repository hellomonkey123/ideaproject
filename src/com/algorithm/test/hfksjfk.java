package com.algorithm.test;

import java.util.Scanner;

/**
 * @program: hfksjfk
 * @description:
 * @author: liu yuanwen
 * @create: 2019/8/6
 */
public class hfksjfk {


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int V = in.nextInt();
        int N = in.nextInt();
        String[] orders = new String[V];
        String[] degs = new String[N];
        for(int i = 0; i < N; i++){
            degs[i] = in.next();
        }
        for(int i = 0; i < V; i++){
            orders[i] = in.nextLine();
        }

        String[][] ss = new String[V][2];
        for(int i = 0; i < V; i++){
             ss[i] = orders[i].split(" ");
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < V; j++){
                if(degs[i].equals(ss[j][0])){
                    System.out.println(ss[j][1]);
                    break;
                }

            }

        }

    }
}

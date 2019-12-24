package com.algorithm.test;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @program: PrintTreeNodeInRecircle
 * @description:
 * @author: liu yuanwen
 * @create: 2019/8/11
 */
public class PrintTreeNodeInRecircle {

    public static ArrayList<ArrayList<Integer>> PrintTreeNodeInRecircle(TreeNode root){

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();  //放入奇数行节点
        Stack<TreeNode> s2 = new Stack<>();  //放入偶数行节点

        s1.push(root);
        int num = 1;

        while(!s1.empty() || !s2.empty()){
            if (num % 2 == 1){
                ArrayList<Integer> tmp = new ArrayList<>();

                while(!s1.empty()){
                    TreeNode node = s1.pop();
                    if (node != null) {
                        tmp.add(node.val);
                        s2.push(node.left);
                        s2.push(node.right); //栈先入后出，注意要逆序入栈
                    }
                }
                if (!tmp.isEmpty()) {
                    list.add(tmp);
                    num++;
                }
            }else {
                ArrayList<Integer> tmp = new ArrayList<>();

                while(!s2.empty()){
                    TreeNode node = s2.pop();
                    if (node != null) {
                        tmp.add(node.val);
                        s1.push(node.right);
                        s1.push(node.left); //栈先入后出，注意要逆序入栈
                    }
                }
                if (!tmp.isEmpty()) {
                    list.add(tmp);
                    num++;
                }
            }
        }

        return list;
    }
}

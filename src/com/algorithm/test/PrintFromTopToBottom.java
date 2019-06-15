package com.algorithm.test;

import org.junit.Test;

import java.util.ArrayList;
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class PrintFromTopToBottom {

    private ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        if(root == null) return list;

        //list.add(root.val);
        //if(root.left == null && root.right == null) return list;
        //if(root.left != null) list.add(root.left.val);
        //if(root.right != null) list.add(root.right.val);
        findNode(root);
        list.add(0,root.val);
        return list;
    }

    public ArrayList<Integer> findNode(TreeNode root){
        if(root.left == null && root.right == null) return list;
        if(root.left != null) list.add(root.left.val);
        if(root.right != null) list.add(root.right.val);
        if(root.left != null) findNode(root.left);
        if(root.right != null)  findNode(root.right);
        return list;
    }
    @Test
    public void test(){
        TreeNode tree = new TreeNode(5);
        tree.left.val = 4;
        tree.left.left.val = 3;
        tree.left.left.left.val = 2;
        tree.left.left.left.right.val = 1;

        ArrayList tmp = printFromTopToBottom(tree);
    }
}

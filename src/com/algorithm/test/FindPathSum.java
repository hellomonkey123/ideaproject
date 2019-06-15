package com.algorithm.test;

import org.junit.Test;

import java.util.ArrayList;
/*class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}*/


public class FindPathSum {

    private ArrayList<ArrayList<Integer>> Tlist = new ArrayList<>();
    private ArrayList<Integer> tmplist = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null) return Tlist;
        tmplist.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null){
            Tlist.add(new ArrayList<Integer>(tmplist));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        //找到最后发现都不是，然后清掉又回去找
        tmplist.remove(tmplist.size() - 1);
        return Tlist;
    }

    @Test
    public void test(){
        TreeNode tree = new TreeNode(10);
        tree.left.val = 5;
        tree.right.val = 12;
        tree.left.left.val = 4;
        tree.left.right.val = 7;
        //tree.left.left.left.right.val = 1;
        FindPath(tree, 22);
    }

}

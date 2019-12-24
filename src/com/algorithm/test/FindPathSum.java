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
        //System.out.println(tmplist.get(1));
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
        //System.out.println(tmplist.get(1));
        return Tlist;
    }

    @Test
    public void test(){
        TreeNode tree = new TreeNode(10);
        tree.left = new TreeNode(5);
        tree.right =  new TreeNode(12);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(7);
        //tree.left.left.left.right.val = 1;
        ArrayList<ArrayList<Integer>> list = FindPath(tree, 22);
        for (ArrayList ss : list){
            for(Object aa : ss){
                System.out.print(aa + " ");
            }
            System.out.println();
        }
    }

}

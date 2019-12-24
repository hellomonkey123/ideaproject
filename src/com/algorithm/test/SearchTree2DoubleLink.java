package com.algorithm.test;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @program: SearchTree2DoubleLink
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/19
 */
public class SearchTree2DoubleLink {

    private class TreeNode{
        private int val;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }
    }

    protected TreeNode leftLast = null;
    public TreeNode Convert(TreeNode root){
        if (root == null) return null;

        if (root.left == null && root.right == null){
            leftLast = root;
            return root;
        }

        TreeNode left = Convert(root.left);

        if (left != null){
            leftLast.right = root;
            root.left = leftLast;
        }

        leftLast = root;

        TreeNode right = Convert(root.right);

        if (right != null) {
            right.left = root;
            root.right = right;
        }

        return left != null ? left : root;

    }

}

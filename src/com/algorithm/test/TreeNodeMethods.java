package com.algorithm.test;

import org.junit.Test;

import java.util.Stack;

/**
 * @program: TreeNodeMethods
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/31
 */
public class TreeNodeMethods {
    private int index = 0;
    public TreeNode FindKthTreeNode(TreeNode pRoot, int k){
        if(k==0 || pRoot == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = pRoot;
        while(node != null || !stack.isEmpty()){
            if(node != null){
                stack.push(node);
                node = node.left;
            }else {
                node = stack.pop();
                index++;
                if(index == k)
                    return node;
                node = node.right;
            }
        }
        return null;
    }

    //查找特定元素,递归方法
    public boolean FindValue(int val, TreeNode root){
        if (root == null) return false;
        if (val > root.val) return FindValue(val, root.right);
        else if(val < root.val) return FindValue(val, root.left);
        return true;
    }

    //查找特定元素,非递归方法
    public boolean FindVal1(int val, TreeNode root){
        while(root != null){
            if (val > root.val) root = root.right;
            else if(val < root.val) root = root.left;
            else
                return true;
        }
        return false;
    }

    // 另外最大最小元素分别在最右，最左侧，这里不写
    public TreeNode FindMin(TreeNode root){
        if (root == null) return root;
        return FindMin(root.left);
    }

    public TreeNode FindMax(TreeNode root){
        if (root == null) return root;
        return FindMax(root.right);
    }

    //插入一个元素
    public TreeNode Insert(int val, TreeNode root) throws Exception {

        if(root == null) return root = new TreeNode(val);

        if (val > root.val ){
            if (root.right != null)
                root = root.right;
            else
                return root.right = new TreeNode(val);
        } else if(val < root.val) {
            if (root.left != null)
                root = root.left;
            else
                return root.left = new TreeNode(val);
        }else
            throw new Exception() ;


       /* 递归方式
       if (val > root.val)
           root.right = Insert(val, root.right);
        else
           root.left = Insert(val, root.left);
           */

        return root;
    }

    //删除一个节点
    public TreeNode remove(int val, TreeNode root){
        if (root == null) return root;
        if (val > root.val){
            root.right = remove(val, root.right);
        }else if(val < root.val){
            root.left = remove(val, root.left);
        }else if (root.left != null && root.right != null){
            //存在两个节点时，必定上去的是右侧最小的节点
            root.val = FindMin(root.right).val;
            root.right = remove(root.val, root.right); //后面要删去这个上移的节点
        }else
            //只有一个节点时，哪个不为空指向哪个
            root = (root.left != null) ? root.left : root.right; //只有一个节点时
        return root;
    }

    @Test
    public void test(){

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        System.out.println(FindKthTreeNode(root, 1).val);
        System.out.println(FindValue(4, root));
        System.out.println(FindValue(9, root));
    }
}

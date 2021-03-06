package com.xm.jy.leetcode.sn.SN0400;

import com.xm.jy.leetcode.data_structure.TreeNode;

/**
 * @author: albert.fang
 * @date: 2020/11/3 16:34
 * @description: 226. 翻转二叉树
 */
public class SN0226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}

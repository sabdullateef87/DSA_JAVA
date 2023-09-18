package BinaryTrees.Problems;

import BinaryTrees.Learning.BinaryTree;
import BinaryTrees.Learning.Node;
import BinaryTrees.Learning.TreeNode;

public class BinaryTreeQ {
    public static int getTheMaximumHeightOfBinaryTree(Node root){
        if(root == null){
            return 0;
        }
        int left = getTheMaximumHeightOfBinaryTree(root.left);
        int right = getTheMaximumHeightOfBinaryTree(root.right);
        return Math.max(left, right) + 1;

    }

    public static boolean sameBinaryTree(TreeNode tree1, TreeNode tree2){
        if (tree1 == null || tree2 == null){
            return false;
        }
    }
}

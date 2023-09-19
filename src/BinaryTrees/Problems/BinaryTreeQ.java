package BinaryTrees.Problems;

import BinaryTrees.Learning.BinaryTree;
import BinaryTrees.Learning.Node;
import BinaryTrees.Learning.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeQ {
    public static int getTheMaximumHeightOfBinaryTree(Node root){
        if(root == null){
            return 0;
        }
        int left = getTheMaximumHeightOfBinaryTree(root.left);
        int right = getTheMaximumHeightOfBinaryTree(root.right);
        return Math.max(left, right) + 1;

    }

    public static boolean sameBinaryTree(Node tree1, Node tree2){
        if(tree1 == null && tree2 == null) return true;
        if (tree1 == null || tree2 == null) return false;

        if(tree1.value == tree2.value){
            return sameBinaryTree(tree1.right, tree2.right) && sameBinaryTree(tree1.left, tree2.left);
        }
        return false;
    }

    public static class cousinsOfBinaryTreeOne{
        static Node xParent;
        static Node yParent;
        static int xDepth = -1, yDepth = -1;
        public static boolean isCousins(Node root, int x, int y){
            retrieveParent(root, null, x, y, 0);
            return xParent != yParent && xDepth == yDepth;

        }

        public static void retrieveParent(Node node, Node parent, int x, int y, int depth){
            if(node == null){
                return;
            }
            if(node.value == x){
                xParent = parent;
                xDepth = depth;
            }else if(node.value == y){
                yParent = parent;
                yDepth = depth;
            }

            retrieveParent(node.left, node, x, y, depth + 1);
            retrieveParent(node.right, node, x, y, depth + 1);
        }

    }


}

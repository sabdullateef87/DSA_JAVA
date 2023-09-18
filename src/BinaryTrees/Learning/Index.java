package BinaryTrees.Learning;

import BinaryTrees.Problems.BinaryTreeQ;

public class Index {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.right = new Node(4);
        tree.root.left.left.left = new Node(5);
        tree.root.left.left.left.right = new Node(4);
        tree.root.left.left.left.left = new Node(5);
        tree.root.left.left.left.right.right = new Node(4);
        tree.root.left.left.left.right.left = new Node(5);

        tree.printInorder(tree.root);
        System.out.println();
        tree.printPreOrder(tree.root);
        System.out.println();
        tree.printPostOrder(tree.root);

        System.out.println(Math.max(BinaryTreeQ.getTheMaximumHeightOfBinaryTree(tree.root.left), BinaryTreeQ.getTheMaximumHeightOfBinaryTree(tree.root.right)));
    }
}

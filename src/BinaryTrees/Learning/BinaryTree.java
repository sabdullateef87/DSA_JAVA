package BinaryTrees.Learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BinaryTree {
    Node root;
    BinaryTree(){
        root = null;
    }

    public void printInorder(Node node){

        List<Integer> out = new ArrayList<>();
        if(node == null){
            return;
        }
        printInorder(node.left);
        System.out.print(" Node -> " + node.value + " -> ");
        printInorder(node.right);

    }

    public void printPreOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(" Node -> " + node.value + " -> ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public void printPostOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(" Node -> " + node.value + " -> ");
        printPostOrder(node.left);
        printPostOrder(node.right);
    }
}

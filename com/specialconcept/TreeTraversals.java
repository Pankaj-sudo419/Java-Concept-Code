package com.specialconcept;


import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class TreeTraversals {

//    Depth First Search (DFS)
//    DFS explores as far as possible along each branch before backtracking.
//    It can be implemented using recursion or a stack.

//    Types of DFS Traversal:
//    Pre-order Traversal (Node -> Left -> Right)
//    In-order Traversal (Left -> Node -> Right)
//    Post-order Traversal (Left -> Right -> Node)

//    Breadth First Search (BFS)
//    BFS explores all nodes at the present depth level before moving on to nodes at the next depth level.
//    It is implemented using a queue.

//    Type of BFS Traversal:
//    Level-order Traversal (Level by level from top to bottom)


    public void preOrder(TreeNode root){
        if(root == null) return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    public void postOrder(TreeNode root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    public void levelOrder(TreeNode root){
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode curr = queue.poll();
            System.out.println(curr.val);

            if(curr.left != null){
                queue.add(curr.left);
            }

            if (curr.right != null){
                queue.add(curr.right);
            }
        }
    }

    public static void main(String[] args) {
      TreeNode root = new TreeNode(2);
      root.left = new TreeNode(3);
      root.right = new TreeNode(5);
      root.left.left = new TreeNode(9);
      root.left.right = new TreeNode(10);
      root.right.right = new TreeNode(13);
      root.right.left = new TreeNode(5);

      TreeTraversals traversals = new TreeTraversals();
        System.out.println("Pre-order Traversal:");
        traversals.preOrder(root);
        System.out.println();

        System.out.println("In-order Traversal:");
        traversals.inOrder(root);
        System.out.println();

        System.out.println("Post-order Traversal:");
        traversals.postOrder(root);
        System.out.println();

        System.out.println("Level-order Traversal:");
        traversals.levelOrder(root);
        System.out.println();
    }
}



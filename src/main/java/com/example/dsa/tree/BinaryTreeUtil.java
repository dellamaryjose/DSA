package com.example.dsa.tree;

public class BinaryTreeUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     BinaryTree<Integer> binaryTree = new BinaryTree<>();
     binaryTree.createBinaryTree(binaryTree);
     //binaryTree.preOrder(binaryTree.root);
     System.out.println("PreOrder---");
     binaryTree.preOrderIterative(binaryTree.root);
     System.out.println("");
     System.out.println("InOrder---");
     binaryTree.inorder(binaryTree.root);
     System.out.println("InOrder--Iterative-");
     System.out.println("");
     binaryTree.inOrderIterative(binaryTree.root);
	}

}

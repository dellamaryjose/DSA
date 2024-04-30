package com.example.dsa.tree;

import java.util.Stack;

public class BinaryTree1<T> {
	TreeNode<T> root;
	
	private class TreeNode<T>{
		
		TreeNode<T> left;
		TreeNode<T> right;
		T data;
		
		
		public TreeNode(T data) {
			
			this.data = data;
		}
		
		
		
	}
	

	public BinaryTree1<Integer> createBinaryTree(){
	
	BinaryTree1<Integer> bn = new BinaryTree1<>();
	TreeNode<Integer> first = new TreeNode<Integer>(9);
	TreeNode<Integer> second = new TreeNode<Integer>(2);
	TreeNode<Integer> third = new TreeNode<Integer>(3);
	TreeNode<Integer> fourth = new TreeNode<Integer>(4);
	TreeNode<Integer> fifth = new TreeNode<Integer>(7);
	bn.root = (BinaryTree1<Integer>.TreeNode<Integer>) first;
	first.left =second;
	first.right = third;
	second.left = fourth;
	second.right = fifth;
	
	
	return bn;
	
	}
	
	
	public void preOrder(TreeNode<T> root) {
		if(root == null) {
			
			return;
		}
		
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
		
	}
	
	public void preOrderIterative(TreeNode<T> root) {
		
		if(root==null){
		return;
		}
		Stack<TreeNode<T>> stack = new Stack<>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			TreeNode<T> temp = stack.pop();
			System.out.print(temp.data);
			if(temp.right!=null) {
				stack.push(temp.right);
			}
			if(temp.left!=null) {
				stack.push(temp.left);
				
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		BinaryTree1<Integer> bn1 = new BinaryTree1<>();
		bn1= bn1.createBinaryTree();
		bn1.preOrder(bn1.root);
		System.out.println("Iterative----");
		bn1.preOrderIterative(bn1.root);
	}
	
	
	
}

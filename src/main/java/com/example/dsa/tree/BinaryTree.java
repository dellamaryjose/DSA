package com.example.dsa.tree;

import java.util.Stack;

public class BinaryTree<T> {
Node<T> root;


private class Node<T>{
	
	Node<T> left;
	Node<T> right;
	T element;
	
	public Node(T element) {
		
		this.element = element;
	}
	
}


public void createBinaryTree(BinaryTree<Integer> binaryTree) {
	
	Node<Integer> first = new Node<Integer>(9);
	Node<Integer> second = new Node<Integer>(2);
	Node<Integer> third = new Node<Integer>(3);
	Node<Integer> fourth = new Node<Integer>(4);
	Node<Integer> fifth = new Node<Integer>(5);
	binaryTree.root = (BinaryTree<Integer>.Node<Integer>) first;
	first.left = second;
	first.right = third;
	second.left= fourth;
	second.right = fifth;
	
}

public void preOrder(Node<T> root) {
	if(root==null) {
		
	return;	
	}
	System.out.print(root.element+" ");
	preOrder(root.left);
	preOrder(root.right);
}

public void preOrderIterative(Node<T> root) {
	
	if(root==null) {
		
		return;
	}
	Stack<Node<T>> stack = new Stack<Node<T>>();
	stack.push(root);
	Node<T> temp =null;
	while(!stack.isEmpty()) {
		
		temp= stack.pop();
		System.out.print(temp.element+" ");
		if(temp.right!=null) {
			
			stack.push(temp.right);
		}
		
		if(temp.left!=null) {
			
			stack.push(temp.left);
		}
	}
	
}

public void inorder(Node<T> root) {
	
	if(root==null) {
		return;
		
	}
	inorder(root.left);
	System.out.print("---"+root.element);
	inorder(root.right);
}

public void inOrderIterative(Node<T> root) {
	
	Node<T> temp= root;
	Stack<Node<T>> stack = new Stack();
	if(root==null) {
		
		return;
	}
	while(temp!=null || !stack.isEmpty()) {
		
		if(temp!=null) {
			
		stack.push(temp);
		temp=temp.left;
			
		}else {
			temp = stack.pop();
			System.out.print(temp.element+" ");
			temp=temp.right;
			
			
		}
		
		
	}
	
}
}

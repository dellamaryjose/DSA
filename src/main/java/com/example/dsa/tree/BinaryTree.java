package com.example.dsa.tree;

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;


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

public void postOrder(Node<T> root) {
	
	if(root==null) {
		
		return;
	}
	postOrder(root.left);
	postOrder(root.right);
	System.out.print(root.element+" ");
}

public void postOrderIterative(Node<T> root) {
	
if(root==null) {
	
	return;
}	
Stack<Node<T>> stack = new Stack();
Node<T> current = root;

while(current!=null || !stack.isEmpty()) {

	if(current!=null) {
		stack.push(current);
		current = current.left;
	}else {
		
		Node<T> temp = stack.peek().right;
		
		if(temp==null) {
			temp = stack.pop();
			System.out.print(temp.element+" ");
			while(!stack.isEmpty()&&temp==stack.peek().right) {
				
				temp = stack.pop();
				System.out.print(temp.element+" ");
			}
		}else {
			
			current = temp;
		}
	}
	
}


}

public void levelOrder(Node<T> root) {
	if(root == null) {
		return;
	}
	
	Queue<Node<T>> queue = new LinkedList<>();
	queue.offer(root);
	Node<T> temp =null;
	
	while(!queue.isEmpty()) {
		
		temp = queue.poll();
		System.out.print(temp.element+" ");
		if(temp.left!=null) {
			queue.offer(temp.left);
		}
		if(temp.right!=null) {
			queue.offer(temp.right);
		}
	}
	
}

public int findMax(Node<Integer> root) {
	if(root==null) {
		
	return Integer.MIN_VALUE;	
	}
int result = root.element;
int left = findMax(root.left);
int right = findMax(root.right);
	if(left>result) {
		result = left;
	}
	if(right>result) {
		result = right;
	}
	return result;
}
public int findMin(Node<Integer> root) {
	if(root==null) {
		
	return Integer.MAX_VALUE;	
	}
int result = root.element;
int left = findMin(root.left);
int right = findMin(root.right);
	if(left<result) {
		result = left;
	}
	if(right<result) {
		result = right;
	}
	return result;
}
}

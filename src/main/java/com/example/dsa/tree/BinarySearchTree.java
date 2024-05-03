package com.example.dsa.tree;

public class BinarySearchTree {

	TreeNode root;
	
	private class TreeNode{
		
		TreeNode left;
		TreeNode right;
		int element;
		
		public TreeNode(int element) {
			
			this.element = element;
		}
		
		
		
	}
	
	public void insert(int element) {
		
		root = insertNode(root, element);
	}
	public TreeNode insertNode(TreeNode root,int element) {
			
		if(root == null) {
		
			root = new TreeNode(element);
			return root;
		}
		if(element< root.element) {
			
			root.left = insertNode(root.left,element);
		}
		
if(element> root.element) {
			
			root.right = insertNode(root.right,element);
		}

return root;
	}
	
	public void preOrder(TreeNode root) {
		
		if(root==null) {
			
			return;
		}
		
		System.out.print(root.element+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public TreeNode search(TreeNode root , int key) {
		
		if(root==null || root.element== key) {
			
		return root;	
		}
		
		if(key<root.element) {
			
			return search(root.left,key);
		}else {
			
			return search(root.right,key);
		}
	}
	
	
}

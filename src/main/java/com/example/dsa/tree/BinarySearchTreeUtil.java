package com.example.dsa.tree;



public class BinarySearchTreeUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BinarySearchTree bst = new BinarySearchTree();
bst.insert(6);
bst.insertNode(bst.root, 9);
bst.insertNode(bst.root, 3);
bst.insertNode(bst.root, 2);
bst.insertNode(bst.root, 5);
bst.insertNode(bst.root, 10);
bst.preOrder(bst.root);


if(null !=(bst.search(bst.root, 7))) {
	
	System.out.println("Key found");
}else {
	System.out.println("Key NOT found");
	
}
	}

}

package com.example.dsa;

public class LinkedList<T>  {

	Node<T> head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list = new LinkedList<>();
		list.add(list,1);
		list.add(list,12);
		list.print();
		list.delete(list, 13);
		System.out.println("After Deletion");
		list.print();
	
	}

	
	public class Node<T>{
		
	T data ;
	Node<T> next;
	
	public Node(T data) {
		
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString() {
		return data.toString();
	}
		
	}
	
	public  void add(LinkedList<T> list , T element) {
		Node <T>newNode = new Node<T>(element);
		Node<T> currentNode = null;
		if(head==null) {
			
			head=newNode;
		}
		else {
			
			currentNode = head;
			 while(currentNode.next!=null) {
				 
				currentNode = currentNode.next; 
			 }
			currentNode.next = newNode;
		}
		
	}
	
	public void print() {
		Node<T> current = null;
		if(this!=null && this.head!=null) {
			current = head ;
			System.out.println(head);
			while(current.next!=null) {
				
				System.out.println(current.next);
				
				current = current.next;
			}
			
			
		}
	}

	@Override
	public String toString() {
		return "LinkedList [head=" + head + "]";
	}
	
	public LinkedList<T> delete(LinkedList<T> list, T element){
		Node<T> currentNode ,prev = null;
		
		if(list.head!=null && list.head.data == element) {
			
			list.head = head.next;
			System.out.println("Element head deleted");
			return list;
		}
		currentNode = list.head.next;
		prev = list.head;
		while(currentNode!=null) {
			
			if(currentNode.data==element) {
				prev.next = currentNode.next;
				System.out.println("Element Deleted");
				return list;
			}
			prev = currentNode;
			currentNode = currentNode.next;
			
		}
		
		 if(currentNode==null) {
			 
		System.out.println("Element Not found");	 
		 }
		return list;
	}
	
}



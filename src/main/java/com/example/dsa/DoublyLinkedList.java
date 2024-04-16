package com.example.dsa;

public class DoublyLinkedList<T> {
	
Node<T>	head;
Node<T> tail;

	
	class Node<T>{
		
		T element;
		Node<T> next;
		Node<T> previous;
		Node(T ele){
			this.element = ele;
			next =  null;
			previous = null;
			
		}
		@Override
		public String toString() {
			return element +"";
		}
		
	}
	
	public void add(T element) {
		Node<T> newNode = new Node<>(element);
		Node<T> currentNode;
		if(head ==null) {
			head = tail = newNode;
			head.previous = null;
			tail.next = null;
			return;
		}
		
		currentNode = head;
		System.out.println("currentNode --"+currentNode);
		head = newNode;
		head.next = currentNode;
		currentNode.previous = head;
		
		
		
	}

	public static void main(String[] args) {
		
		DoublyLinkedList<Integer>  dl = new DoublyLinkedList<>();
		dl.add(1);
		dl.add(2);
		dl.add(6);
		System.out.println(dl);
	}

	@Override
	public String toString() {
		Node<T> currentNode = head;
		String msg = "DoublyLinkedList [";
		boolean flag = false;
		while(currentNode!=null) {
			if(flag)
			msg = msg+ "," ;
			flag = true;
			msg = msg +currentNode.element;
			currentNode = currentNode.next;
		}
		msg = msg +"]";
		return msg;
	}

}

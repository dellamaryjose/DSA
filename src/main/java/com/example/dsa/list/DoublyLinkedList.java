package com.example.dsa.list;

import java.util.NoSuchElementException;

public class DoublyLinkedList<T> {
	Node<T> head;
	Node<T> tail;

	static class Node<T> {

		T element;
		Node<T> previous;
		Node<T> next;

		public Node(T element) {

			this.element = element;
		}
	}


	public String toString() {
		
		Node<T> currentNode = head;
		String msg="";
		while(currentNode!=null) {
			
			msg = msg+"-->"+currentNode.element;
			currentNode = currentNode.next;
		}
		msg = msg+"-->null";
		return msg;
		
		
		
	}
	
	public void insertFirst(T element) {
		
		Node<T> newNode = new Node<T>(element);
		if(head==null && tail == null) {
			
			tail = newNode;
		}
		else {
			
			head.previous = newNode;
		}
		newNode.next=head;
		head = newNode;
		
	}
	
	public void insertLast(T element) {
		Node<T> newNode = new Node<>(element);
		if(head==null ||tail==null) {
			head=newNode;
			
		}else {
			
			tail.next = newNode;
		}
		newNode.previous = tail;
		tail=newNode;
	}
public Node<T> deleteFirst() {
	
	if(head==null) {
		
		throw new NoSuchElementException();
	}
	Node<T> temp = head;
	if(head==tail) {
		
		tail=null;
	}
	else {
		head.next.previous = null;
		
		
	}
	head = head.next;
	temp.next = null;
	return temp;
}

public Node<T> deleteLast(){
	Node<T> temp = tail;
	if(head==null) {
	 throw new NoSuchElementException();	
		
	}
	
	if(head==tail) {
		System.out.println("true");
		head= null;
	}
	else {
		
		tail.previous.next=null;
	}
	
	
	tail= tail.previous;
	temp.previous=null;
	return temp;
	
	
}
}

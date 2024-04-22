package com.example.dsa.list;

import java.util.NoSuchElementException;

public class CircularilyLinkedList <T>{

	Node<T> last;
	int length;
	
	
	static class  Node<T> {
		Node<T> next;
		T element;
		
		public Node(T elem){
			
			element = elem;
			next = null;
		}
		
	}
	
	public CircularilyLinkedList() {
		
		last = null;
		length=0;
	}
	
	public void insertFisrt(T element) {
		
		Node<T> temp = new Node<>(element);
		if(last==null) {
			
			last = temp;
		}else {
			
			temp.next = last.next;
		}
		
		last.next=temp;
		length++;
	}
	public int getLenth() {
		
		return length;
	}
	
	public void insertEnd(T element) {
		Node<T> temp = new Node<>(element);
		if(last==null) {
			last=temp;
			last.next=temp;
		}
		else {
			
			temp.next = last.next;
			last.next=temp;
			last=temp;
		}
		
		length++;
	}
	
	public boolean isEmpty() {
		
		return length==0;
		
	}
	
	public Node<T> removeFisrt(){
		
		Node<T> temp = last.next;
		
		if(last==null) {
			
			throw new NoSuchElementException();
		}if(last.next==last){
		last=null;
		}
		else {
			
			last.next = temp.next;
			
		}
		temp.next=null;
		length--;
		return temp;
		
	}
	
	public Node<T> removeLast(){
		
		Node<T> temp = last.next;
		
		if(last==null) {
			throw new NoSuchElementException();
		}
		
		if(last==last.next) {
			
			last=null;
			
		}else {
			
			while(temp.next!=last) {
				
				temp=temp.next;
			}
			temp.next=last.next;
			last=temp;
		}
		length--;
		
		
	return temp;
		
	}
	public String toString() {
		
		String msg="";
		
		Node<T> first = last==null?null:last.next;
		while(first!=null &&first!=last) {
			
			msg=msg+"-->"+first.element;
			first = first.next;
		}
		if(first!=null) {
			
			msg=msg+"-->"+first.element;
		}
		return msg;
		
	}
}

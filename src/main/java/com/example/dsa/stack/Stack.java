package com.example.dsa.stack;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Stack<T> {
Node<T> top;
int length;

private class Node<T>{
	T element;
	Node<T> next;
	
	public Node(T element) {
		
		this.element= element;
		this.next=null;
	}
	
	
}

public Stack() {
	top=null;
	length=0;
	
}
public int length() {
	
	return length;
}
public boolean isEmpty() {
	
	return length ==0;
}
public void push(T element) {
	Node<T> temp = new Node<>(element);
	temp.next=top;
	top=temp;
	length++;
	
}

public void pop() {
	
	Node<T> temp = null;
	if(top==null) {
		throw new NoSuchElementException("No data in stack");
	}
	else {
	temp = top.next;
	top=temp;
	length--;
	}
	}
	public String toString() {
		String msg ="-->";
		Node<T> temp = top;
		while(temp!=null) {
			
			msg= msg+"-->"+temp.element;
			temp=temp.next;
		}
		return msg;
	}
	
	public T peek() {
	
		if(isEmpty()) {
			
			throw new EmptyStackException();
		}
		return top.element;
	}
}
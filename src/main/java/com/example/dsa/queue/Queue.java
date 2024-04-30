package com.example.dsa.queue;

public class Queue<T> {

	Node<T> front;
	Node<T> rear;
	int length;
	
	private class Node<T>{
		
		T element;
		Node<T> next;
		
		public Node(T element) {
			
			this.element = element;
			this.next = null;
					
		}
		
		
	}
	
	public int length() {
		
		return length;
	}
	
	public boolean isEmpty() {
		
		
		return length==0;
	}
	
	public void enqueue(T element) {
		
		Node<T> temp = new Node(element);
		if(isEmpty()) {
			
			front= temp;
		}else {
			
			rear.next = temp;
		}
		
		rear = temp;
		length++;
	}
	
	
	public void dequeue() {
		
		if(isEmpty()) {
			
			throw new RuntimeException("Queue is empty");
		}
		
		Node<T> temp = front;
		
		if(front==rear) {
			
			rear=null;
			front=rear;
		}else {
			front= front.next;
			
		}
		temp.next = null;
		
	length--;
	}
	public String toString() {
		
		String msg="";
		
		Node<T> current = front;
		
		while(!isEmpty()&&current.next!=null) {
			
			msg=msg+"-->"+current.element;
			current = current.next;
		}
		String last = current==null?"":current.element.toString();
		msg=msg+"-->"+last;
		return msg;
		
		
		
	}
}

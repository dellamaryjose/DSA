package com.example.dsa.stack;



public class StackArrayImpl {

	int top;
	int array[];
	
	public StackArrayImpl(int capacity) {
		top=-1;
		this.array = new int[capacity];
	}
	
	public void push(int element) {
		
		if(isFull()) {
			
			throw new RuntimeException("Stak is full");
			
		}
		top++;
		System.out.println("Top---"+top);
		array[top] = element;
	}
	
	
	public int pop() {
		
		if(isEmpty()) {
			
			throw new RuntimeException("Stack is empty");
		}
		int result = array[top];
		top--;
		return result;
	}
	public boolean isEmpty() {
		
		return top==-1;
		
		
	}
	public boolean isFull() {
		
		return array.length == top+1;
	}
	
	public String toString() {
		
		String msg="";
		int len=top;
		while(len>-1) {
			msg=msg+"-->"+array[len];
			len--;
			
		}
		
		return msg;
		
	}
}

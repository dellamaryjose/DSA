package com.example.dsa.stack;

public class StackUtil {

	public static void main(String[] args) {
	Stack<Integer> stack = new Stack<>();
	stack.push(2);
	stack.push(5);
	System.out.println(stack);
	System.out.println(stack.peek());
	stack.pop();
	System.out.println("First--"+stack);
	System.out.println("peek--"+stack.peek());
	stack.pop();
	System.out.println("Second"+stack);
	//System.out.println("peek--"+stack.peek());
	
	//using array
	StackArrayImpl stackArrayImpl = new StackArrayImpl(3);
	System.out.println("using array"+stackArrayImpl);
	stackArrayImpl.push(1);
	stackArrayImpl.push(2);
	System.out.println("1 push"+stackArrayImpl);
	stackArrayImpl.push(3);
	System.out.println("2 push"+stackArrayImpl);
	stackArrayImpl.pop();
	System.out.println("POP 1"+stackArrayImpl);
	stackArrayImpl.pop();
	System.out.println("POP 2"+stackArrayImpl);
	stackArrayImpl.pop();
	System.out.println("POP 3"+stackArrayImpl);
	}

}

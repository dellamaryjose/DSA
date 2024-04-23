package com.example.dsa.stack;

import java.util.Stack;
import java.util.stream.IntStream;
public class NextLargestElementFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = {4,7,3,4,8,1};
System.out.println("Input:");
IntStream.range(0, array.length).forEach(i->System.out.print(array[i]+" "));
System.out.println("");
int[] output = find(array);
System.out.println("output");
IntStream.range(0, array.length).forEach(i->System.out.print(output[i]+" "));

	}

	public static int[] find(int[] array) {
		
		int result[] = new int[array.length];
		Stack<Integer> stack = new Stack<>();
		for(int i=array.length-1;i>=0;i--) {
			
			while(!stack.isEmpty() && stack.peek()<array[i]) {
				stack.pop();
				
			}
			
			if(stack.isEmpty()) {
				result[i]=-1;
				stack.push(array[i]);
				
			}else {
				result[i]=stack.peek();
				stack.push(array[i]);
			}
		}
		
		return result;
		
	}
}

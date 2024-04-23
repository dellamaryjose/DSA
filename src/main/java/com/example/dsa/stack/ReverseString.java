package com.example.dsa.stack;

import java.util.Stack;
import java.util.stream.IntStream;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word ="ABCD";
System.out.println("Before--"+word);
System.out.println("After--"+reverse(word));
	}

	public static String reverse(String word) {
		
		char[] charArray = word.toCharArray();
		Stack<Character>  stack = new Stack<>();
		for(Character c:charArray) {
			stack.push(c);
		}
		
	IntStream.range(0, charArray.length).forEach(
				i->{charArray[i] = stack.pop();}
				);
	
	String result = new String(charArray);
	return result;
	}
}

package com.example.dsa.stack;

import java.util.Stack;

import org.springframework.validation.annotation.Validated;

public class StringValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="[({)}{}]";
System.out.println(validate(s));
	}

	public static boolean validate(String s) {
		
		boolean flag = false;
		
		char[] charArray = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for(Character c: charArray) {
			
			if(stack.isEmpty() && (c==')'||c=='}'||c==']')) {
				
				flag= false;
				return flag;
			}
			else if(c=='('||c=='{'||c=='[') {
				
				stack.push(c);
			
				
			}else if((c==')'&& stack.peek()=='(')
					||(c=='}'&& stack.peek()=='{')
					||(c==']'&& stack.peek()=='[')) {
				
				stack.pop();
				flag = true;
				
			}
			else {
				flag=false;
				return flag;
			}
			
			
		}
		
		
		return flag;
		
	}
}

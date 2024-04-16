package com.example.dsa.arrays;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "that";
System.out.println(check(word));
	}

	
	public static boolean check(String word) {
		boolean flag = false;
		int start =0;
		int end = word.length()-1;
		char[] charArray = word.toCharArray();
		while(start<end) {
			if(charArray[start]!=charArray[end]) {
			flag= false;
			return flag;
			}else {
				
				flag =true;
				start++;
				end--;
			}
			
		}
		return flag;
		
	}
}

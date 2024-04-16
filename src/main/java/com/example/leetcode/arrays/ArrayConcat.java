package com.example.leetcode.arrays;

import java.util.Arrays;

public class ArrayConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = new int[] {1,2,1};
Arrays.stream(concat(array)).forEach(System.out::println);
	}

public static int[] concat(int[] array) {
	int len = array.length;
	int[] newArray = new int[2*len];
	for(int i=0;i<len;i++) {
		
		newArray[i] = newArray[i+len] = array[i];
	}
	return newArray;
}

}

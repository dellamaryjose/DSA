package com.example.leetcode.arrays;

import java.util.Arrays;

public class ArrayFromPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[] {5,0,1,2,3,4};
Arrays.stream(buildArray(array)).forEach(System.out::println);;
	}
	
	public static int[] buildArray(int[] array) {
		
		int[] newArray = new int[array.length];
		int index =0;
		
		for(int i=0;i<array.length;i++) {
			
		index= array[i];
			newArray[i] = array[index];
		}
		
		return newArray;
	}

}
